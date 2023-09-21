package com.example.EatHub.Transformers;

import com.example.EatHub.Models.Cart;
import com.example.EatHub.ResponceDtos.CartResponce;
import lombok.Data;

import java.util.ArrayList;

@Data
public class CartTransformer {

    public static CartResponce dtoToCartResponce(Cart cart){

        CartResponce cartResponce = CartResponce.builder()
                .cartTotal(cart.getCartTotal())
                .foodItems(new ArrayList<>())
                .build();

        return cartResponce;
    }
}
