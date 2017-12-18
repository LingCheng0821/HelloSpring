/**
 * File：Item.java
 * Package：com.fang.spring.el
 * Author：chengling
 * Date：2017年4月26日 下午3:06:29
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean")
public class Item {
  @Value("cl")
  private String name;
  @Value("10")
  private int qty;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public int getQty() {
    return qty;
  }
  
  public void setQty(int qty) {
    this.qty = qty;
  }

  @Override
  public String toString() {
    return "Item [name=" + name + ", qty=" + qty + "]";
  }
  
  
}
