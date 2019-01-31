package com.itheima.ui;

import com.itheima.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        ICustomerService iCustomerService = (ICustomerService) applicationContext.getBean("iCustomerService");
        iCustomerService.saveCustomer();
        iCustomerService.deleteCustomer();
        iCustomerService.updateCustomer(1);
    }
}
