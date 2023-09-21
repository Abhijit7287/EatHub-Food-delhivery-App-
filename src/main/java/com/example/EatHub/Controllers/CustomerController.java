package com.example.EatHub.Controllers;

import com.example.EatHub.RequestDtos.CustomerRequest;
import com.example.EatHub.ResponceDtos.CustomerResponce;
import com.example.EatHub.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("/add")
    public ResponseEntity addCustomer(@RequestBody CustomerRequest customerRequest){

        CustomerResponce customerResponce = customerService.addCustomer(customerRequest);

        return new ResponseEntity(customerResponce, HttpStatus.OK);
    }


    @GetMapping("/findbyMobNo")
    public ResponseEntity findByMobNo(@RequestParam("mobNo")String mobNo){

        try {
            CustomerResponce customerResponce = customerService.findByMobile(mobNo);
            return new ResponseEntity(customerResponce, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
