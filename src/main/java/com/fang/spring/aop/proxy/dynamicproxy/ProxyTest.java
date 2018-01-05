package com.fang.spring.aop.proxy.dynamicproxy;

/**
 * Created by Laura on 2018/1/4.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Service service = new UserServiceImpl();
        MyInvocatioHandler handler = new MyInvocatioHandler(service);
        Service serviceProxy = (Service)handler.getProxy();
        serviceProxy.add();
    }
}
