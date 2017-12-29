package com.lty.freamwork.service;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.Method;

public class EatHelper implements MethodBeforeAdvice,AfterReturningAdvice{

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before");
    }

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("After");
    }
}
