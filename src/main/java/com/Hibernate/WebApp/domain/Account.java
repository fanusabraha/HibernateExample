package com.Hibernate.WebApp.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountID;
    @Column(length = 100)
    private String accoutName;
    // mappedby is used for
    @OneToMany (mappedby = "accountId")
    private List <Transaction> transaction;
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
}
