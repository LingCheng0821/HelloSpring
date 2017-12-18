/**
 * File：JdbcProgram.java
 * Package：com.fang.spring.jdbc.test
 * Author：chengling
 * Date：2017年4月25日 下午3:20:24
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.jdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fang.spring.jdbc.bean.Customer;
import com.fang.spring.jdbc.dao.CustomerDAO;

public class JdbcProgram {
  public static void main( String[] args )
  {
    ApplicationContext context =  new ClassPathXmlApplicationContext("jdbc/applicationContext.xml");
     
      CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
      Customer customer = new Customer(1, "yiibai",29);
      customerDAO.insert(customer);
    
      Customer customer1 = customerDAO.findByCustomerId(1);
      System.out.println(customer1);
      
  }
}