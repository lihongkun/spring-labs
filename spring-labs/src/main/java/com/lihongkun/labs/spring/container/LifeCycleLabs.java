package com.lihongkun.labs.spring.container;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleLabs {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle.xml");
        applicationContext.getBean("lifeCycleBean");
        applicationContext.close();
    }
}
