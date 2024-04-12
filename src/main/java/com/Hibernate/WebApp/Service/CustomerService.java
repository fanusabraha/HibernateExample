package com.Hibernate.WebApp.Service;

import com.Hibernate.WebApp.domain.Customer;
import com.Hibernate.WebApp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
    public Customer findById(Long id){
        Optional <Customer> findById =  customerRepository.findById(id);
        return findById.orElse(new Customer());
    }
    // the save method saves existing and also creates a new one too
    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }


}
