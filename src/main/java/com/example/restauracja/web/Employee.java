package com.example.restauracja.web;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private Integer salary;
}

//{
//    "name" : "Tomasz",
//    "salary" : 12000
//        }