package com.example.Spring6.repository;

import com.example.Spring6.dao.ProductDAO;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductDAO,Integer> {
}
