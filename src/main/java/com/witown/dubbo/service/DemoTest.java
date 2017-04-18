package com.witown.dubbo.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by treebear on 2016/9/19.
 */
public class DemoTest {

    public static void main(String args[]){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:springContext.xml");
        applicationContext.start();
        MyTestService myTestService =  applicationContext.getBean(MyTestService.class);
        System.out.println(myTestService.sayHello());
    }
}
