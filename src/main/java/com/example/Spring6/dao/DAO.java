package com.example.Spring6.dao;

import com.example.Spring6.model.Customer;

import java.util.Optional;

public interface DAO <T>{
    Optional<T> get (Integer id);
    void create (T t);
    void update (T t);
    void delete (T t);
    void save(Customer t);
}
