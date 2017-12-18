/**
 * File：SpringHelloWorld.java
 * Package：com.fang.spring.helloworld.impl
 * Author：chengling
 * Date：2017年4月25日 下午2:43:23
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.helloworld.impl;

import com.fang.spring.helloworld.HelloWorld;


public class SpringHelloWorld implements HelloWorld {

  @Override
  public void sayHello() {
    System.out.println("Spring Say Hello!!");
  }


}
