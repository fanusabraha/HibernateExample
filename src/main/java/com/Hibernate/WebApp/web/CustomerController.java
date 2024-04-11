package com.Hibernate.WebApp.web;

import com.Hibernate.WebApp.Service.CustomerService;
import com.Hibernate.WebApp.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("")
    public String findAllCustomers (ModelMap map){
        List<Customer> allCustomers = customerService.findAll();
    return "Bank-Customers";}
}
