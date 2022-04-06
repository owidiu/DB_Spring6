package com.example.Spring6.dao;

import com.example.Spring6.model.Customer;
import com.example.Spring6.repository.OrderRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;
@RequiredArgsConstructor
public class OrderDAO implements DAO<OrderDAO>{
    private final OrderRepository orderRepository;

    @Override
    public Optional<OrderDAO> get(Integer id) {
        return orderRepository.findById(id);
    }

    @Override
    public void create(OrderDAO order) {
        orderRepository.save(order);
    }

    @Override
    public void delete(OrderDAO order) {
        orderRepository.delete(order);
    }

    @Override
    public void save(Customer t) {

    }

    @Override
    public void update(OrderDAO order) {
        orderRepository.save(order);
    }
}
