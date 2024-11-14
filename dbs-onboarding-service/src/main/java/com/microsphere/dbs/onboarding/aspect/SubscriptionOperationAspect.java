package com.microsphere.dbs.onboarding.aspect;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;
import com.microsphere.dbs.onboarding.annotation.SubscriptionOperation;
import com.microsphere.dbs.onboarding.aspect.describer.SubscriptionEventDescriber;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

@Slf4j
@Component
@Aspect
@AllArgsConstructor
public class SubscriptionOperationAspect {

  private final AutowireCapableBeanFactory beanFactory;

  @Around("@annotation(com.microsphere.dbs.onboarding.annotation.SubscriptionOperation)")
  public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
    Object target = joinPoint.getThis();
    Class<?> targetClass = target != null ? AopUtils.getTargetClass(target) : null;
    Method targetClassMethod = ClassUtils.getMostSpecificMethod(
        ((MethodSignature) joinPoint.getSignature()).getMethod(), targetClass);
    SubscriptionOperation auditableOperation = AnnotatedElementUtils.getMergedAnnotation(
        targetClassMethod, SubscriptionOperation.class);
    assert auditableOperation != null;
    return this.invokeAndAudit(joinPoint, auditableOperation);
  }

  private Object invokeAndAudit(ProceedingJoinPoint joinPoint,
      SubscriptionOperation auditableOperation) throws Throwable {

    SubscriptionEventDescriber eventDescriber;
    try {
      log.debug("Attempting to get {} bean", auditableOperation.eventDescriberClass());
      eventDescriber = this.beanFactory.getBean(auditableOperation.eventDescriberClass());
      log.debug("Successfully retrieved {} bean", auditableOperation.eventDescriberClass());
    } catch (NoSuchBeanDefinitionException ex) {
      throw new InternalServerErrorException(ex);
    }

    Map<String, Object> arguments = getArgumentsFromJoinPoint(joinPoint);
    Object response;
    Subscription subscription = eventDescriber.describeInitiated(auditableOperation, arguments);
    try {
      response = joinPoint.proceed();
      eventDescriber.describeSuccessful(subscription, auditableOperation, arguments, response);
    } catch (Throwable e) {
      eventDescriber.describeFailed(subscription);
      throw e;
    }

    return response;
  }

  public static Map<String, Object> getArgumentsFromJoinPoint(ProceedingJoinPoint joinPoint) {
    String[] parameters = ((MethodSignature) joinPoint.getSignature()).getParameterNames();
    Object[] invocationArguments = joinPoint.getArgs();
    Map<String, Object> arguments = new HashMap<>();

    for (int i = 0; i < parameters.length; ++i) {
      arguments.put(parameters[i], invocationArguments[i]);
    }

    return arguments;
  }
}
