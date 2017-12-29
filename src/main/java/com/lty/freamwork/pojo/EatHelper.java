package com.lty.freamwork.pojo;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class EatHelper implements MethodBeforeAdvice,AfterReturningAdvice{
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("吃饭后");
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("吃饭前");
    }
}
