package com.Hibernate.WebApp.web;

import com.Hibernate.WebApp.Service.CustomerService;
import com.Hibernate.WebApp.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.time.LocalDate;
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
        // this is for the updating model
        map.put("newCustomer",oneCustomer);
        return "Bank-Customers";}

    // a new class can be created for this GetMapping
    // we put new customer which does not have a value
    @GetMapping("/customers/register")
    public String GetCreateCustomer (ModelMap map){
        map.put("customers",new Customer());
        return "register";}
    // Customer customer is to be posted and saved
    @PostMapping("/customers/register")
    public String createCustomer (Customer customer){
        customerService.createCustomer(customer);
        return "redirect:/customers/register";}

    // updating existing customer
    @PostMapping("/customers/{Id}")
    public String updateExistingCustomer (Customer customer){
        customerService.createCustomer(customer);
        return "redirect:/customers/" + customer.getUserId();}

    // deleting a customer
    @PostMapping("/customers/{Id}/delete")
    public String deleteCustomer (@PathVariable long Id){
        customerService.deleteCustomer(Id);
        return "redirect:/customers";}
    @GetMapping("/{name}/{username}")
    public String findByName(ModelMap map, @PathVariable String name, @PathVariable LocalDate username){
        //List<Customer> userList = customerService.findByName(name);
        //List<Customer> findByStartDateBetween= customerService.findByStartDateBetween(name,username);
        //List<Customer> userList = customerService.findByNameAndUsername(name, username);
        List <Customer> cus = customerService.findByNameAndLocalDateOnly(name,username);
        map.put("findhim",cus);
        return "find";
    }

}
