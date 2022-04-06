package com.example.Spring6.repository;

import com.example.Spring6.dao.CustomerDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<CustomerDAO,Integer> {
    List<CustomerDAO> findAllByUsernameAndCityAndCountry(String username, String city, String country);
}
