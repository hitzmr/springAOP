package com.itheima.service.impl;

import com.itheima.service.ICustomerService;

public class ICustomerServiceImpl implements ICustomerService {
    @Override
    public void saveCustomer() {
        System.out.println("saveCustomer");
    }

    @Override
    public void updateCustomer(int i) {
        System.out.println("updateCustomer : " + i);
    }

    @Override
    public int deleteCustomer() {
        System.out.println("deleteCustomer");
        return 0;
    }
}
