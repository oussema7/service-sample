package com.microsphere.dbs.onboarding.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import com.microsphere.dbs.onboarding.aspect.describer.SubscriptionEventDescriber;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SubscriptionOperation {

  Class<? extends SubscriptionEventDescriber> eventDescriberClass();

}
