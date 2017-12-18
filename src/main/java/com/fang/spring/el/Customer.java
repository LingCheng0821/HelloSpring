/**
 * File：Customer.java
 * Package：com.fang.spring.el
 * Author：chengling
 * Date：2017年4月26日 下午3:04:18
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("customerBean")
public class Customer {
  
   @Value("#{itemBean}")
   private Item item;
   
   @Value("#{itemBean.name}")
   private String itemName;

  
  public Item getItem() {
    return item;
  }

  
  public void setItem(Item item) {
    this.item = item;
  }

  
  public String getItemName() {
    return itemName;
  }

  
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  @Override
  public String toString() {
    return "Customer [item=" + item + ", itemName=" + itemName + "]";
  }

}
