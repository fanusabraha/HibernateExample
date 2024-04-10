package com.Hibernate.WebApp.domain;

import jakarta.persistence.*;

@Entity
public class Adress {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String adress1;
    private String adress2;
    private String city;
    private String region;
    private String country;
    @OneToOne ()
    @MapsId
    @JoinColumn(name = "customer_adress")
    private Customer customer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdress1() {
        return adress1;
    }

    public void setAdress1(String adress1) {
        this.adress1 = adress1;
    }

    public String getAdress2() {
        return adress2;
    }

    public void setAdress2(String adress2) {
        this.adress2 = adress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
