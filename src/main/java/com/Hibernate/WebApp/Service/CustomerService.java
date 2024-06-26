package com.Hibernate.WebApp.Service;

import com.Hibernate.WebApp.domain.Customer;
import com.Hibernate.WebApp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    public List<Customer> findByNameAndUsername(String name, String username){
        return customerRepository.findByNameAndUsername(name, username);
    }

    public List<Customer> findByStartDateBetween (LocalDate date1, LocalDate date2){
        return customerRepository.findByLocalDateBetween(date1, date2);
    }


    public List<Customer> findByNameAndLocalDateOnly(String name, LocalDate localDate) {
        return customerRepository.findExactlyByNameAndLocalDateOnly(name, localDate);
    }
    public List <Customer> findAllCustomersWithPerformance(){
        return customerRepository.findAllCustomersWithPerformance();
    }
}
