package com.example.Spring6.controller;

import com.example.Spring6.dao.CustomerDAO;
import com.example.Spring6.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value ="customer")
public class Spring6Controller {

    private final CustomerDAO customerDAO;

    @GetMapping()
    void createCustomer(@RequestBody Customer customer) {
        customerDAO.save(customer);
    }

    //@GetMapping()
    //List<Customer> getAllCustomers() {
    //    return customerDAO.findAll();
    //}

    @GetMapping("/filter")
    public ModelAndView filterCustomers( String username,  String city,  String country) {

        List<CustomerDAO> customers = customerDAO.findAllByUsernameAndCityAndCountry(username, city, country);

        ModelAndView modelAndView = new ModelAndView("customersView");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }





}
