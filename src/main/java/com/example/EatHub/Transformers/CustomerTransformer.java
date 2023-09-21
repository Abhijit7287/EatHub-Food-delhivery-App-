package com.example.EatHub.Transformers;

import com.example.EatHub.Models.Customer;
import com.example.EatHub.RequestDtos.CustomerRequest;
import com.example.EatHub.ResponceDtos.CartResponce;
import com.example.EatHub.ResponceDtos.CustomerResponce;

public class CustomerTransformer {

    public static Customer dtoToCustomer(CustomerRequest customerRequest){

        Customer customer = Customer.builder()
                .adress(customerRequest.getAdress())
                .email(customerRequest.getEmail())
                .gender(customerRequest.getGender())
                .mobNo(customerRequest.getMobNo())
                .name(customerRequest.getName())
                .build();

        return customer;
    }

    public static CustomerResponce dtoToCustomerResponce(Customer customer){

        CartResponce cartResponce = CartTransformer.dtoToCartResponce(customer.getCart());

        CustomerResponce customerResponce = CustomerResponce.builder()
                .address(customer.getAdress())
                .mobileNo(customer.getMobNo())
                .name(customer.getName())
                .cart(cartResponce)
                .build();

        return customerResponce;
    }


}
