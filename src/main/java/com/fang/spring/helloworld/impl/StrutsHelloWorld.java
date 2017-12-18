/**
 * File：StrutsHelloWorld.java
 * Package：com.fang.spring.helloworld.impl
 * Author：chengling
 * Date：2017年4月25日 下午2:49:22
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.helloworld.impl;

import com.fang.spring.helloworld.HelloWorld;


public class StrutsHelloWorld implements HelloWorld {
  
  @Override
  public void sayHello() {
      System.out.println("Struts Say Hello!!");
  }

}
