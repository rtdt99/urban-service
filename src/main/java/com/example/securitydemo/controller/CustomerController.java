package com.example.securitydemo.controller;


import com.example.securitydemo.model.db.Customer;
import com.example.securitydemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET,value = "/customer")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/customer/{id}")
    public Customer getCustomer(@PathVariable int id){
        return customerService.getCustomer(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/customer")
    public void addCustomer(@RequestBody  Customer customer){
        customerService.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/customer/{id}")
    public void updateCustomer(@PathVariable int id, @RequestBody Customer customer){
        customerService.updateCustomer(id,customer);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/customer/{id}")
    public void deleteCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
    }
}
