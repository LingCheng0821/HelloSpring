package com.fang.spring.aop.proxy.staticproxy;

/**
 * Created by Laura on 2018/1/4.
 */
public class ProxyTest {
    public static void main(String args[]) {
        RealSubject subject = new RealSubject();
        Proxy p = new Proxy(subject);
        p.request();
    }
}
