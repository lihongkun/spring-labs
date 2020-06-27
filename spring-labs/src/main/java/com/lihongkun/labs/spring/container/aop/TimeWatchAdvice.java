package com.lihongkun.labs.spring.container.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TimeWatchAdvice {

    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("before method "+joinPoint.getSignature().getName());
    }

    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("after method "+joinPoint.getSignature().getName());
    }

    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        try {
            long start = System.nanoTime();
            Object result = joinPoint.proceed();
            long end = System.nanoTime();
            System.out.println(String.format("%s took %d ns", joinPoint.getSignature().getName(), (end - start)));
            return result;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
