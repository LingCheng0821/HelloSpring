/**
 * File：CustomerDAO.java
 * Package：com.fang.spring.jdbc.dao
 * Author：chengling
 * Date：2017年4月25日 下午3:11:36
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.jdbc.dao;

import com.fang.spring.jdbc.bean.Customer;

public interface CustomerDAO {
  public void insert(Customer customer);
  public Customer findByCustomerId(int custId);
}
