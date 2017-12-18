/**
 * File：Person.java
 * Package：com.fang.spring.autowired
 * Author：chengling
 * Date：2017年4月25日 下午5:15:11
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.list;

public class PersonBean {
  private String name;
  private String address;
  private int age;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
  }
  
}
