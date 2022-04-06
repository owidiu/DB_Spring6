package com.example.Spring6.model;


import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name="order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private long timestamp;

    @ManyToOne
    public Customer customers;

    @ManyToOne
    public List<Product> products;
}
