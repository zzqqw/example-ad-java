package com.example.ad.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//可以标识类上也可以标识在方法上
@Target({ElementType.TYPE, ElementType.METHOD})
//运行时
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreResponseAdvice {
}