package com.example.EatHub.Models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order_entity")
@Data
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String orderId;

    private Double orderTotal;

    @CreationTimestamp
    private Date orderTime;

    @ManyToOne
    @JoinColumn
    private DelhiveryPartner delhiveryPartner;

    @OneToMany(mappedBy = "orderEntity",cascade = CascadeType.ALL)
    private List<FoodItem> foodItemList = new ArrayList<>();

    @ManyToOne
    @JoinColumn
    private Restaurant restaurant;

    @ManyToOne
    @JoinColumn
    private Customer customer;
}
