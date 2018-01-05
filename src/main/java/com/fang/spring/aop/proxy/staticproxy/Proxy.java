package com.fang.spring.aop.proxy.staticproxy;

/**
 * Created by Laura on 2018/1/4.
 */
public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }
    public void request(){
        System.out.println("begin");
        subject.request();
        System.out.println("end");
    }
}
