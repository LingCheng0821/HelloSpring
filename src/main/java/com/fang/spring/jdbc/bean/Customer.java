/**
 * File：Customer.java
 * Package：com.fang.spring.jdbc.bean
 * Author：chengling
 * Date：2017年4月25日 下午3:10:37
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.jdbc.bean;


public class Customer {
  private int custId;
  private String name;
  private int age;

  public Customer() {
    super();
  }

  public Customer(int custId, String name, int age) {
    super();
    this.custId = custId;
    this.name = name;
    this.age = age;
  }


  public int getCustId() {
    return custId;
  }
  
  public void setCustId(int custId) {
    this.custId = custId;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Customer [custId=" + custId + ", name=" + name + ", age=" + age + "]";
  }
  
  
}
