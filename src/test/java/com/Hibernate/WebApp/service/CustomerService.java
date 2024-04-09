package com.Hibernate.WebApp.service;

import com.Hibernate.WebApp.domain.Customers;
import com.Hibernate.WebApp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
//    public  <Customers> FindAll(){
//        return customerRepository;
//    }
}
