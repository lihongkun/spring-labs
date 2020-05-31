package com.lihongkun.labs.spring.container;

import com.lihongkun.labs.spring.container.devicewriter.DeviceWriter;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryLab {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

        DeviceWriter deviceWriter = beanFactory.getBean("deviceWriter", DeviceWriter.class);
        deviceWriter.saveToDevice();
    }
}
