/**
 * File：HelloWorldService.java
 * Package：com.fang.spring.helloworld
 * Author：chengling
 * Date：2017年4月25日 下午2:42:14
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.helloworld;


public class HelloWorldService {
  private HelloWorld helloWorld;
  
  public HelloWorldService() {

  }

  public void setHelloWorld(HelloWorld helloWorld) {
      this.helloWorld = helloWorld;
  }

  public HelloWorld getHelloWorld() {
      return this.helloWorld;
  }
}
