package com.advancedjava.springtraining.aspect;

import org.aspectj.lang.JoinPoint;

public class MyAspectInterceptor {

    public void interceptToString(JoinPoint joinPoint) throws Throwable {
        System.out.println("player toString method will be called");

    }

    public void interceptorToStringReturning(JoinPoint joinPoint, String returnObject) throws Throwable {
        System.out.println("player toString method has been called and has returned : " + returnObject);
    }
}
