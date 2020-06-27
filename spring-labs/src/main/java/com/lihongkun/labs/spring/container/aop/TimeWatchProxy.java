package com.lihongkun.labs.spring.container.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeWatchProxy implements InvocationHandler {

    private Object obj;

    public static Object newInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance
                (obj.getClass().getClassLoader(), obj
                .getClass().getInterfaces(), new TimeWatchProxy(obj));
    }

    private TimeWatchProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try {
            System.out.println("before method " + method.getName());
            long start = System.nanoTime();
            result = method.invoke(obj, args);
            long end = System.nanoTime();
            System.out.println(String.format("%s took %d ns", method.getName(), (end-start)) );
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
        } finally {
            System.out.println("after method " + method.getName());
        }
        return result;
    }
}
