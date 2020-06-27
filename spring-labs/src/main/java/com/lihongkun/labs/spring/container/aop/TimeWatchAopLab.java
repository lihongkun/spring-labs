package com.lihongkun.labs.spring.container.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TimeWatchAopLab {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
        IBookService bookService = (IBookService)applicationContext.getBean("bookService");
        bookService.create(new Book());
        bookService.update(new Book());
    }
}
