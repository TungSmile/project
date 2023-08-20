package com.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String description;
    @ManyToOne
    private Category category;
    @ManyToOne
    private StatusOrder statusOrder;
    @ManyToOne
    private Seller seller;
}
