package com.lihongkun.labs.spring.container.aop;

public class TimeWatchProxyApp {
    public static void main(String[] args) {
        IBookService bookService = (IBookService) TimeWatchProxy.newInstance(new BookService());
        bookService.create(new Book());
        bookService.update(new Book());
    }
}
