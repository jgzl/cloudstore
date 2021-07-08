package com.github.jgzl.cloudstore.customer.gatewayimpl;

import com.github.jgzl.cloudstore.customer.CustomerDO;
import com.github.jgzl.cloudstore.customer.mapper.CustomerMapper;
import com.github.jgzl.cloudstore.domain.customer.Customer;
import com.github.jgzl.cloudstore.domain.customer.gateway.CustomerGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerGatewayImpl implements CustomerGateway {
    @Autowired
    private CustomerMapper customerMapper;

    public Customer getByById(String customerId){
      CustomerDO customerDO = customerMapper.getById(customerId);
      //Convert to Customer
      return null;
    }
}
