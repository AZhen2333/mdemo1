package cn.quancheng.mdemo1test;

import cn.quancheng.mdemo1test.model.Customer;
import cn.quancheng.mdemo1test.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;

import java.util.List;

public class CustomerServiceTest {

    private  CustomerService customerService;

    public CustomerServiceTest(){
        customerService = new CustomerService();
    }

    @Before
    public void init(){

    }

    public void getCustomerListTest(){
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2, customerList.size());
    }
}
