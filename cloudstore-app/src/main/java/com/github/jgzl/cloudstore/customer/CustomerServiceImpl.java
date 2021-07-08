package com.github.jgzl.cloudstore.customer;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.catchlog.CatchAndLog;
import com.github.jgzl.cloudstore.api.CustomerServiceI;
import com.github.jgzl.cloudstore.dto.CustomerAddCmd;
import com.github.jgzl.cloudstore.dto.CustomerListByNameQry;
import com.github.jgzl.cloudstore.dto.data.CustomerDTO;
import org.springframework.stereotype.Service;

import com.github.jgzl.cloudstore.customer.executor.CustomerAddCmdExe;
import com.github.jgzl.cloudstore.customer.executor.query.CustomerListByNameQryExe;

import javax.annotation.Resource;


@Service
@CatchAndLog
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

}