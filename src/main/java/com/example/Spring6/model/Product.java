package com.example.Spring6.model;

import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name="product")
public class Product {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;
    private int price;
    private String description;

    @OneToMany
    public List<Order> orders;

}
