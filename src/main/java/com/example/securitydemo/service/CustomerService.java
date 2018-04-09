package com.example.securitydemo.service;

import com.example.securitydemo.model.db.Customer;
import com.example.securitydemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private  CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        List<Customer> customerList = new ArrayList<>();
        customerRepository.findAll().forEach(customerList::add);
        return customerList;
    }

    public Customer getCustomer(int id){
        return customerRepository.findById(id).orElse(null);
    }

    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public void updateCustomer(int id, Customer customer){
        if(id == customer.getCustomerId())
            customerRepository.save(customer);
    }

    public void deleteCustomer(int id){
        customerRepository.deleteById(id);
    }
}
