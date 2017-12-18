/**
 * File：AutowiredProgram.java
 * Package：com.fang.spring.autowired
 * Author：chengling
 * Date：2017年4月25日 下午5:22:02
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredProgram {
  
  public static void main( String[] args ){
    ApplicationContext context =  new ClassPathXmlApplicationContext("autowired/applicationContext.xml");
    Customer cust = (Customer)context.getBean("customer");
    System.out.println(cust);   
  }
}
