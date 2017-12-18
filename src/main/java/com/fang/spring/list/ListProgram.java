/**
 * File：PrototypeProgram.java
 * Package：com.fang.spring.prototype
 * Author：chengling
 * Date：2017年4月26日 上午10:02:56
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListProgram {
  public static void main( String[] args ){
    ApplicationContext context =  new ClassPathXmlApplicationContext(new String[] {"list/applicationContext.xml"});
    CustomerBean cust = (CustomerBean)context.getBean("CustomerBean");
    System.out.println(cust);
  }
}
