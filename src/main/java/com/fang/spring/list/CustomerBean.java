/**
 * File：CustomerBean.java
 * Package：com.fang.spring.List
 * Author：chengling
 * Date：2017年4月26日 上午10:16:22
 * Copyright (C) 2003-2017 搜房资讯有限公司-版权所有
 */
package com.fang.spring.list;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class CustomerBean {
  private List<Object> lists;
  private Set<Object> sets;
  private Map<Object, Object> maps;
  private Properties pros;
  
  public List<Object> getLists() {
    return lists;
  }
  
  public void setLists(List<Object> lists) {
    this.lists = lists;
  }
  
  public Set<Object> getSets() {
    return sets;
  }
  
  public void setSets(Set<Object> sets) {
    this.sets = sets;
  }
  
  public Map<Object, Object> getMaps() {
    return maps;
  }
  
  public void setMaps(Map<Object, Object> maps) {
    this.maps = maps;
  }
  
  public Properties getPros() {
    return pros;
  }
  
  public void setPros(Properties pros) {
    this.pros = pros;
  }

  @Override
  public String toString() {
    return "CustomerBean [lists=" + lists + ", sets=" + sets + ", maps=" + maps + ", pros=" + pros
        + "]";
  }
}
