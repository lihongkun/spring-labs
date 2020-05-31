package com.lihongkun.labs.spring.container.devicewriter;

public class DeviceWriter {

    private IDeviceWriter deviceWriter;

    public void setDeviceWriter(IDeviceWriter deviceWriter){
        this.deviceWriter = deviceWriter;
    }

    public void saveToDevice(){
        deviceWriter.saveToDevice();
    }

}
