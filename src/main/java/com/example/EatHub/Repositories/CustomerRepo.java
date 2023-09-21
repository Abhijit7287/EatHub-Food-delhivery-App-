package com.example.EatHub.Repositories;

import com.example.EatHub.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{

   public Customer findByMobNo(String mobNo);
}
