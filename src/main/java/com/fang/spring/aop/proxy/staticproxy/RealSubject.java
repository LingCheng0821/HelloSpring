package com.fang.spring.aop.proxy.staticproxy;

/**
 * Created by Laura on 2018/1/4.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject");
    }
}
