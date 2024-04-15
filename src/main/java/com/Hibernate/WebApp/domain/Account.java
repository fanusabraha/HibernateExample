package com.Hibernate.WebApp.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;
    @Column(length = 100)
    private String accountName;
    @ManyToMany(mappedBy = "accounts")
    private List<Customer> customer = new ArrayList<>();
    @OneToMany (mappedBy = "account")
    private List <Transaction> transaction= new ArrayList<>();

    // mappedby is used for referencing the variable name which is already identified in the child class

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }
}
