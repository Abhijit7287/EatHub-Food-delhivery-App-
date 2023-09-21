package com.example.EatHub.Exceptions;

public class CustomerNotFound extends RuntimeException {

    public CustomerNotFound(String msg){
        super(msg);
    }
}
