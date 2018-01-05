package com.fang.spring.aop.dynamicproxy;

/**
 * Created by Laura on 2018/1/4.
 */
public class JavaCoder implements ICoder {
    private String name;

    public JavaCoder(String name){
        this.name = name;
    }

    @Override
    public void implDemands(String demandName) {
      System.out.println(name + " implemented demand:" + demandName + " in JAVA!");     
    }

}
