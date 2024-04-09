package com.Hibernate.WebApp.repository;

import com.Hibernate.WebApp.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

//    public <Customer> findAll(){
//        return findAll();
//    }

}
