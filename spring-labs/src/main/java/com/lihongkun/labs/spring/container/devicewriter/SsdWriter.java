package com.lihongkun.labs.spring.container.devicewriter;

public class SsdWriter implements IDeviceWriter {
    public void saveToDevice() {
        System.out.println("save to ssd writer");
    }
}
