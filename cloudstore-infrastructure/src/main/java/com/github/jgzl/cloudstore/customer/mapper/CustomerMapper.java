package com.github.jgzl.cloudstore.customer.mapper;

import com.github.jgzl.cloudstore.customer.CustomerDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper{

  public CustomerDO getById(String customerId);
}
