package com.qxcjs.main;

import com.qxcjs.mybatis.domain.TableDependInfo;
import com.qxcjs.mybatis.service.TableDependInfoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMybatisMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"mybatis-spring/spring.xml"});
//        Object service = context.getBean("tableDependInfoMapper");
//        System.out.println(service);
        TableDependInfoService service = (TableDependInfoService)context.getBean("tableDependInfoServiceImpl");
        TableDependInfo key = service.selectByPrimaryKey(1);
        System.out.println(key.toString());
    }
}
