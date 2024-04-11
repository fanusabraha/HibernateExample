package com.Hibernate.WebApp.web;

import com.Hibernate.WebApp.Service.CustomerService;
import com.Hibernate.WebApp.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/customers")
    public String findAllCustomers (ModelMap map){
        List<Customer> allCustomers = customerService.findAll();
        map.put("customers",allCustomers);
    return "Bank-Customers";}
    @GetMapping("/customers/{id}")
    public String findById (ModelMap map, @PathVariable Long id){
        Customer oneCustomer = customerService.findById(id);
        map.put("customers",oneCustomer);
        return "Bank-Customers";}
}
