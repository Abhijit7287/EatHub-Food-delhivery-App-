package com.example.EatHub.Service;

import com.example.EatHub.Exceptions.CustomerNotFound;
import com.example.EatHub.Models.Cart;
import com.example.EatHub.Models.Customer;
import com.example.EatHub.Repositories.CustomerRepo;
import com.example.EatHub.RequestDtos.CustomerRequest;
import com.example.EatHub.ResponceDtos.CustomerResponce;
import com.example.EatHub.Transformers.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public CustomerResponce addCustomer(CustomerRequest customerRequest){

        Customer customer = CustomerTransformer.dtoToCustomer(customerRequest);

        Cart cart  = Cart.
                builder().
                cartTotal(0).
                customer(customer).
                build();

        customer.setCart(cart);

        Customer customer1 = customerRepo.save(customer);

        return CustomerTransformer.dtoToCustomerResponce(customer1);
    }

    public CustomerResponce findByMobile(String mobNo){

        Customer customer = customerRepo.findByMobNo(mobNo);

        if(customer==null){
           throw new CustomerNotFound("Mobile no is incorrect");
        }

        return CustomerTransformer.dtoToCustomerResponce(customer);
    }

}
