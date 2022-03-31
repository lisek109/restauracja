package com.example.restauracja.web;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer salary;
    private String position;
    private Boolean isFree = true;

    @Column(unique = true)
    private String email;

    @OneToOne
    private Client client;
}

//{
//    "name" : "Tomasz",
//    "salary" : 12000
//        }