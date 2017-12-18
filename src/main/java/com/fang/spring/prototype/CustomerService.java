/**
 * File：CustomerService.java
 * Package：com.fang.spring.prototype
 * Author：chengling
 * Date：2017年4月26日 上午10:00:36
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class CustomerService {
  
  String message;
  
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
}