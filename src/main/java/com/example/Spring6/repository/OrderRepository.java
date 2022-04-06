package com.example.Spring6.repository;

import com.example.Spring6.dao.OrderDAO;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderDAO, Integer> {
}
