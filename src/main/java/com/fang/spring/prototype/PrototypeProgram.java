/**
 * File：PrototypeProgram.java
 * Package：com.fang.spring.prototype
 * Author：chengling
 * Date：2017年4月26日 上午10:02:56
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeProgram {
  public static void main( String[] args ){
    ApplicationContext context =  new ClassPathXmlApplicationContext(new String[] {"prototype/applicationContext.xml"});

    CustomerService custA = (CustomerService)context.getBean("customerService");
    custA.setMessage("Message by custA");
    System.out.println("Message : " + custA.getMessage());
    

    CustomerService custB = (CustomerService)context.getBean("customerService");
    System.out.println("Message : " + custB.getMessage());
  }
}
