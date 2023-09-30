package com.example.EatHub.Models;

import com.example.EatHub.Enums.FoodCategory;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "food_item")
@Data
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String dishName;

    @Enumerated(EnumType.STRING)
    private FoodCategory foodCategory;

    private Boolean veg;

    private Boolean isAvailable;

    private Double price;

    @ManyToOne
    @JoinColumn
    private OrderEntity orderEntity;

    @ManyToOne
    @JoinColumn
    private Restaurant restaurant;

    @ManyToOne
    @JoinColumn
    private Cart cart;

    @ManyToOne
    @JoinColumn
    private MenuItem menuItem;
}
