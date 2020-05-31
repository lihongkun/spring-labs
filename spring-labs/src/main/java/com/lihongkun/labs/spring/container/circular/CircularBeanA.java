package com.lihongkun.labs.spring.container.circular;

public class CircularBeanA {
    private CircularBeanB circularBeanB;

    public CircularBeanA(){}

    public CircularBeanA(CircularBeanB circularBeanB){
        this.circularBeanB = circularBeanB;
    }

    public void setCircularBeanB(CircularBeanB circularBeanB){
        this.circularBeanB = circularBeanB;
    }
}
