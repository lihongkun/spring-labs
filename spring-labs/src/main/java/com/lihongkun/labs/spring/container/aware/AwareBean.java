package com.lihongkun.labs.spring.container.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;

public class AwareBean implements ApplicationContextAware,
        ApplicationEventPublisherAware,
        BeanClassLoaderAware,
        BeanFactoryAware,
        MessageSourceAware,
        BeanNameAware {


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(String beanName) {

    }

    @Override
    public void setMessageSource(MessageSource messageSource) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
