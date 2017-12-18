/**
 * File：DateProgram.java
 * Package：com.fang.spring.date
 * Author：chengling
 * Date：2017年4月26日 上午10:42:17
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DateProgram {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("date/applicationContext.xml");

    DateBean cust = (DateBean) context.getBean("dateBean");
    System.out.println(cust);
    
  }
}
