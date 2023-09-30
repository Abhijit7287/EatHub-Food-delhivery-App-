package com.example.EatHub.Models;

import com.example.EatHub.Enums.FoodCategory;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String dishName;

    private double price;

    private FoodCategory foodCategory;

    private boolean veg;

    private boolean available;

    @ManyToOne
    @JoinColumn
    private  Restaurant restaurant;

    @OneToMany(mappedBy = "menuItem",cascade = CascadeType.ALL)
    private List<FoodItem> foodItemList = new ArrayList<>();

}
