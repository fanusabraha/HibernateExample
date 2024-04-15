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
    public Customer findById(Long UserId){
        Optional <Customer> findById =  customerRepository.findById(UserId);
        return findById.orElse(new Customer());
    }
    // the save method saves existing and also creates a new one too
    public void createCustomer(Customer customer){
        customerRepository.save(customer);
    }


    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);
    }
    public List<Customer> findByName(String name){
        return customerRepository.findByName(name);
    }

    public List<Customer> findByPassword(String password){
        return customerRepository.findByPassword(password);
    }

}
