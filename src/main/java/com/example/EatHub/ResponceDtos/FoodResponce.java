package com.example.EatHub.ResponceDtos;

import com.example.EatHub.Enums.FoodCategory;
import lombok.Data;

@Data
public class FoodResponce {

    String dishName;

    double price;

    FoodCategory category;

    boolean veg;
}
