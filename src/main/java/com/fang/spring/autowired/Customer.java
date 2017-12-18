/**
 * File：Customer.java
 * Package：com.fang.spring.autowired
 * Author：chengling
 * Date：2017年4月25日 下午5:13:11
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.autowired;

import javax.annotation.Resource;

public class Customer {
  
  /**
   * @Resource:默认是按照名称来装配注入的，只有当找不到与名称匹配的bean才会按照类型来装配注入；
   * @Autowired:默认是按照类型装配注入的，如果想按照名称来转配注入，则需要结合@Qualifier一起使用；
   */
  @Resource(name="person")
//  @Autowired(required=false)
//  @Qualifier("person")
  private Person person;
 
  private int type;
  private String action;
  
  public int getType() {
    return type;
  }
  
  public void setType(int type) {
    this.type = type;
  }
  
  public String getAction() {
    return action;
  }
  
  public void setAction(String action) {
    this.action = action;
  }

  @Override
  public String toString() {
    return "Customer [person=" + person + ", type=" + type + ", action=" + action + "]";
  }
  
}
