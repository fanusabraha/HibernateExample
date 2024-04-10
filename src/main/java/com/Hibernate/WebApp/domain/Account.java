package com.Hibernate.WebApp.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountID;
    @Column(length = 100)
    private String accoutName;
    @ManyToMany(mappedBy = "account")
    private List<Customer> customer = new ArrayList<>();
    @OneToMany (mappedBy = "account")
    private List <Transaction> transaction= new ArrayList<>();

    // mappedby is used for referencing the variable name which is already identified in the child class

    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public String getAccoutName() {
        return accoutName;
    }

    public void setAccoutName(String accoutName) {
        this.accoutName = accoutName;
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
