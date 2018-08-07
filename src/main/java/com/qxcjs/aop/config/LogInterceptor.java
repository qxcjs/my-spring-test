package com.qxcjs.aop.config;

public class LogInterceptor {
    public void myMethod() {
    }


    public void before() {
        System.out.println("method before");
    }

    public void after() {
        System.out.println("method after");
    }

    public void afterReturning() {
        System.out.println("method afterReturning");
    }

    public void afterThrowing() {
        System.out.println("method afterThrowing");
    }
}
