package com.qxcjs.aop.main;

import com.qxcjs.aop.annotation.User;
import com.qxcjs.aop.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopConfigMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"aop/spring-config.xml"});
        UserService userService = (UserService)context.getBean("userService");
        User user = new User();
        user.setUsername("wt");
        user.setPassword("123555");
        userService.add(user);
        System.out.println(userService);
    }
}
