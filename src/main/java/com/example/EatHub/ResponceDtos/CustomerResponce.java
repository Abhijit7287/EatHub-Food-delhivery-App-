package com.example.EatHub.ResponceDtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerResponce {

    String name;

    String mobileNo;

    String address;

    CartResponce cart;

}
