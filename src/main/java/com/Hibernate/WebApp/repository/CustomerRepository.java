package com.Hibernate.WebApp.repository;

import com.Hibernate.WebApp.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
// creating custom queries
    // List of customers
    List<Customer> findByName(String name);
    List<Customer> findByNameAndUsername(String name, String username);
    // void method of customers
    void findByUsername(String Username);

}
