package com.Hibernate.WebApp.repository;

import com.Hibernate.WebApp.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    // Custom query List of customers
    List<Customer> findByName(String name);

    List<Customer> findByNameAndUsername(String name, String username);

    // finding by localdates between two dates (the name should match eg LocalDate should match the variable)
    List<Customer> findByLocalDateBetween(LocalDate date1, LocalDate date2);

    // void method of customers
    void findByUsername(String Username);
    // creating custom queries JPQL, we use alies not star
    @Query("select c From Customer c where name=:name and localDate= :localDate")
    List <Customer> findExactlyByNameAndLocalDateOnly(String name, LocalDate localDate);

    // lazy fetching is better at performance but the eager type is slower bc it selects them all
    // by default many to many or one to many is lazy and one to one is eagerly fetching type
}
