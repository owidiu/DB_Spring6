package com.example.Spring6.dao;

import com.example.Spring6.model.Customer;
import com.example.Spring6.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;
@RequiredArgsConstructor
public class ProductDAO implements DAO<ProductDAO> {
    private final ProductRepository productRepository;

    @Override
    public Optional<ProductDAO> get(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void create(ProductDAO product) {
        productRepository.save(product);
    }

    @Override
    public void delete(ProductDAO product) {
        productRepository.delete(product);
    }

    @Override
    public void save(Customer t) {

    }

    @Override
    public void update(ProductDAO product) {
        productRepository.save(product);
    }
}
