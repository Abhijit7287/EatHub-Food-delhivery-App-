package com.example.EatHub.Models;

import com.example.EatHub.Enums.RestaurantCategory;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "restaurant")
@Data
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String location;

    @Enumerated(EnumType.STRING)
    private RestaurantCategory restaurantCategory;

    private String contact;

    private Boolean opened;

    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private List<OrderEntity>orderEntityList = new ArrayList<>();

    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private List<FoodItem> foodItemList = new ArrayList<>();

    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private MenuItem menuItem;
}
