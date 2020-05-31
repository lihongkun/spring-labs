package com.lihongkun.labs.spring.container;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularResolveLab {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("circular-resolve.xml");
    }
}
