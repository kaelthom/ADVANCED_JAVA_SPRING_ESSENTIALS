package com.advancedjava.springtraining.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectInterceptor {

    @Before("execution(* com.advancedjava.springtraining.model.*Player.toString(..))")
    public void interceptToString(JoinPoint joinPoint) throws Throwable {
        System.out.println("player toString method will be called");

    }

    @AfterReturning(value = "execution(* com.advancedjava.springtraining.model.*Player.toString(..))", returning = "returnObject")
    public void interceptorToStringReturning(JoinPoint joinPoint, String returnObject) throws Throwable {
        System.out.println("player toString method has been called and has returned : " + returnObject);
    }

    @Around("@annotation(com.advancedjava.springtraining.annotation.MyAnnotation)")
    public void interceptWithAnnotation(ProceedingJoinPoint joinPoint) {
        System.out.println("method called and aspect launched via annotation");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("After method with annotation");
    }
}
