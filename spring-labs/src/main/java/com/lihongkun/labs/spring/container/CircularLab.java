package com.lihongkun.labs.spring.container;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularLab {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("circular.xml");
    }
}
