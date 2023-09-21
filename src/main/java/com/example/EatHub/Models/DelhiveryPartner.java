package com.example.EatHub.Models;

import com.example.EatHub.Enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "delhivery_partner")
@Data
public class DelhiveryPartner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Enumerated(EnumType.ORDINAL)
    private Gender gender;

    private String mobNo;

    @OneToMany(mappedBy = "delhiveryPartner",cascade = CascadeType.ALL)
    private List<OrderEntity> orderEntityList = new ArrayList<>();


}
