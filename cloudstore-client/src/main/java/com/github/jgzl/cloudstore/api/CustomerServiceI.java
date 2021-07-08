package com.github.jgzl.cloudstore.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.github.jgzl.cloudstore.dto.CustomerAddCmd;
import com.github.jgzl.cloudstore.dto.CustomerListByNameQry;
import com.github.jgzl.cloudstore.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
