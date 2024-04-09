package com.Hibernate.WebApp.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountID;
    @Column(length = 100)
    private String accoutName;
}
