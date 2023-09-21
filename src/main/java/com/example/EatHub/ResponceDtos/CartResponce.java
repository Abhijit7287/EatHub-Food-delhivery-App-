package com.example.EatHub.ResponceDtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CartResponce {

    int cartTotal;

    List<FoodResponce> foodItems;
}
