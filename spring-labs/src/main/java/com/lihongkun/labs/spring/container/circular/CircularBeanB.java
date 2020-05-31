package com.lihongkun.labs.spring.container.circular;

public class CircularBeanB {
    private CircularBeanA circularBeanA;

    public CircularBeanB(){}

    public CircularBeanB(CircularBeanA circularBeanA){
        this.circularBeanA = circularBeanA;
    }

    public void setCircularBeanA(CircularBeanA circularBeanA){
        this.circularBeanA = circularBeanA;
    }
}
