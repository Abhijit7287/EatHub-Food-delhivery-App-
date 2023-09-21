package com.example.EatHub.RequestDtos;

import com.example.EatHub.Enums.Gender;
import lombok.Builder;
import lombok.Data;

@Data
public class CustomerRequest {

    private String name;

    private String email;

    private String adress;

    private String mobNo;

    private Gender gender;
}
