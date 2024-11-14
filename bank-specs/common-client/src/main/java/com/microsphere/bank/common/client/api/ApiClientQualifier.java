package com.microsphere.bank.common.client.api;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Spring Qualifier bean used to Identify the Api Client Object, and avoid conflicts if more that one bean is defined
 *
 * @author cesarl
 */
@Qualifier
@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiClientQualifier {

    Class<? extends ConfigurableApiClient> value();
}
