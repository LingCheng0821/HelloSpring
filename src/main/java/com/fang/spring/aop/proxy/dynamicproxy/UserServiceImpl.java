package com.fang.spring.aop.proxy.dynamicproxy;

/**
 * Created by Laura on 2018/1/4.
 */
public class UserServiceImpl implements Service {

    @Override
    public void add() {
        System.out.println("This is add service");
    }
}

