package com.Hibernate.WebApp.repository;

import com.Hibernate.WebApp.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    // Custom query List of customers
    List<Customer> findByName(String name);

    List<Customer> findByNameAndUsername(String name, String username);

    // finding by localdates between two dates
    List<Customer> findByCreatedDateBetween(LocalDate date1, LocalDate date2);

    // void method of customers
    void findByUsername(String Username);
    // creating custom queries JPQL

}
