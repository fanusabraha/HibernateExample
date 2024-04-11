package com.Hibernate.WebApp.Service;

import com.Hibernate.WebApp.domain.Customer;
import com.Hibernate.WebApp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

}
