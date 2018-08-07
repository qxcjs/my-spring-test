package com.qxcjs.aop.annotation;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {
    @Pointcut("execution(public * com.qxcjs.aop.annotation.service..*.add(..))")
    public void myMethod(){
        System.out.println("myMethod");
    }

    @Before("myMethod()")
    public void before() {
        System.out.println("method before");
    }
    @After("myMethod()")
    public void after() {
        System.out.println("method after");
    }
    @AfterReturning("execution(public * com.qxcjs.aop.annotation.dao..*.*(..))")
    public void afterReturning() {
        System.out.println("method afterReturning");
    }
    @AfterThrowing("execution(public * com.oumyye.dao..*.*(..))")
    public void afterThrowing() {
        System.out.println("method afterThrowing");
    }
}
