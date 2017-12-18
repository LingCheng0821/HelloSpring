/**
 * File：DateBean.java
 * Package：com.fang.spring.date
 * Author：chengling
 * Date：2017年4月26日 上午10:32:36
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.date;

import java.util.Date;


public class DateBean {
  
  private Date date;

  
  public Date getDate() {
    return date;
  }

  
  public void setDate(Date date) {
    this.date = date;
  }


  @Override
  public String toString() {
    return "DateBean [date=" + date + "]";
  }
  
  
}
