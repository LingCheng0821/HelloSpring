/**
 * File：HelloProgram.java
 * Package：com.fang.spring
 * Author：chengling
 * Date：2017年4月25日 下午2:50:48
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloProgram {
  public static void main(String[] args) {
    
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
     
    HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
      
    HelloWorld hw= service.getHelloWorld();
     
    hw.sayHello();
}
}
