package com.github.jgzl.cloudstore.domain.customer.gateway;

import com.github.jgzl.cloudstore.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
