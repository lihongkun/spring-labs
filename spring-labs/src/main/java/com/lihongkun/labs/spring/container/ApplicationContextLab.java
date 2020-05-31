package com.lihongkun.labs.spring.container;

import com.lihongkun.labs.spring.container.devicewriter.DeviceWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextLab {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        DeviceWriter deviceWriter = applicationContext.getBean("deviceWriter", DeviceWriter.class);
        deviceWriter.saveToDevice();
    }
}
