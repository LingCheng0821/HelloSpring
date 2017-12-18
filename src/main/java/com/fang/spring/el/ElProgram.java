/**
 * File：ElProgram.java
 * Package：com.fang.spring.el
 * Author：chengling
 * Date：2017年4月26日 下午3:09:06
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.el;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ElProgram {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("el/applicationContext.xml");

    Customer obj = (Customer) context.getBean("customerBean");
    System.out.println(obj);
}
}
