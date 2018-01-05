package com.fang.spring.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * Created by Laura on 2018/1/4.
 */
public class CoderDynamicProxy implements InvocationHandler{
    //被代理的实例
    private ICoder coder;

    public CoderDynamicProxy(ICoder _coder){
        this.coder = _coder;
    }

    //调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(System.currentTimeMillis());
        Object result = method.invoke(coder, args);
        System.out.println(System.currentTimeMillis());
        return result;
    }

}
