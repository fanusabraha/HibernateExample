package com.Hibernate.WebApp.domain;
import jakarta.persistence.*;
@Entity
@Table (name= "User")
public class Customers {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long UserId;
    @Column(length= 100)
    private String name;
    @Column (length = 100)
    private String username;

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
