package com.lihongkun.labs.spring.container.aop;

public class BookService implements IBookService {

    @Override
    public void create(Book book) {
        System.out.println("create book");
    }

    @Override
    public void update(Book book) {
        System.out.println("update book");
    }

}
