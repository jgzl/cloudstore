package com.github.jgzl.cloudstore.domain.customer.gateway;

import com.github.jgzl.cloudstore.domain.customer.Customer;
import com.github.jgzl.cloudstore.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
