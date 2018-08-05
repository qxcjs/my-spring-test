package com.qxcjs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSetterMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-setter.xml"});
        Object user = context.getBean("student");
        System.out.println(user);
    }
}
