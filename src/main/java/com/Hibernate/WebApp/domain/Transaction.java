package com.Hibernate.WebApp.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity @Table(name = "transactions")
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transactionId;
    private LocalDateTime transactionDate;
    private double amount;
    @Column(length = 1)
    private String type;

    @ManyToOne() @JoinColumn(name = "account_id")
    private Account account;
    // joinColumn  is used for preventing name extensions eg account_accountid how jpa would automatically do it

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
