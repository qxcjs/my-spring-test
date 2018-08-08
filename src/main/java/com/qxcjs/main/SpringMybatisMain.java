package com.qxcjs.main;

import com.qxcjs.mybatis.domain.Student;
import com.qxcjs.mybatis.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMybatisMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"mybatis-spring/spring.xml"});
        StudentService service = (StudentService)context.getBean("studentServiceImpl");
        Student student = service.selectUserByID(10001);
        System.out.println(student.toString());
        student.setName("liss");
        try{
            service.updateUser(student);
        }catch ( Exception e){

        }
        System.out.println(service.selectUserByID(10001));

    }
}
