package com.Hibernate.WebApp.repository;

import com.Hibernate.WebApp.domain.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customers,Long> {

    public <Customers> findAll(){
        return findAll();
    }

}
