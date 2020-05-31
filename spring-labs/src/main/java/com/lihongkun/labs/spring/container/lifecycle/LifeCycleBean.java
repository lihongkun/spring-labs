package com.lihongkun.labs.spring.container.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleBean implements InitializingBean, DisposableBean {

    private String propertyValue;

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
        System.out.println("[lifecycle event] setter inject");
    }

    public LifeCycleBean(){
        System.out.println("[lifecycle event] constructor");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("[lifecycle event] PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("[lifecycle event] PreDestroy");
    }

    public void initMethod(){
        System.out.println("[lifecycle event] initMethod");
    }

    public void destroyMethod(){
        System.out.println("[lifecycle event] destroyMethod");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("[lifecycle event] destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[lifecycle event] afterPropertiesSet");
    }
}
