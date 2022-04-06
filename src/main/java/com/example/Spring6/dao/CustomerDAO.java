package com.example.Spring6.dao;

import com.example.Spring6.model.Customer;
import com.example.Spring6.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class CustomerDAO implements DAO<CustomerDAO>{
    private final CustomerRepository customerRepository;

    @Override
    public Optional<CustomerDAO> get(Integer id) {
        return customerRepository.findById(id);
    }

    //public List<Customer> findAll() {
    //    List<Customer> customers = new ArrayList<>();
    //    customerRepository.findAll().forEach(customers::add(C));
    //    return customers;
    //}

    @Override
    public void create(CustomerDAO customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(CustomerDAO customer) {
        customerRepository.delete(customer);
    }

    @Override
    public void save(Customer t) {

    }

    @Override
    public void update(CustomerDAO customer) {
        customerRepository.save(customer);
    }

    public List<CustomerDAO> findAllByUsernameAndCityAndCountry(String username, String city, String country){
        return customerRepository.findAllByUsernameAndCityAndCountry(username, city, country);
    }
}
