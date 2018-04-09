package com.example.securitydemo.repository;

import com.example.securitydemo.model.db.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
