/**
 * File：CustomerDAOImpl.java
 * Package：com.fang.spring.jdbc.dao
 * Author：chengling
 * Date：2017年4月25日 下午3:12:13
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.fang.spring.jdbc.bean.Customer;


public class CustomerDAOImpl implements CustomerDAO
{
  private DataSource dataSource;
  
  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }
  
  @Override
  public void insert(Customer customer){
    
    String sql = "INSERT INTO CUSTOMER (CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
    
    Connection conn = null;   
    try {
      conn = dataSource.getConnection();
      PreparedStatement ps = conn.prepareStatement(sql);
      
      ps.setInt(1, customer.getCustId());
      ps.setString(2, customer.getName());
      ps.setInt(3, customer.getAge());
     
      ps.executeUpdate();
      ps.close();
      
    } catch (SQLException e) {
      throw new RuntimeException(e);
      
    } finally {
      if (conn != null) {
        try {
          conn.close();
        } catch (SQLException e) {}
      }
    }
  }
  
  @Override
  public Customer findByCustomerId(int custId){
    
    String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
    
    Connection conn = null;
    
    try {
      conn = dataSource.getConnection();
      PreparedStatement ps = conn.prepareStatement(sql);
      
      ps.setInt(1, custId);
      Customer customer = null;
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        customer = new Customer(rs.getInt("CUST_ID"), rs.getString("NAME"), rs.getInt("Age"));
      }
      rs.close();
      ps.close();
      return customer;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if (conn != null) {
        try {
        conn.close();
        } catch (SQLException e) {}
      }
    }
  }

  
}
