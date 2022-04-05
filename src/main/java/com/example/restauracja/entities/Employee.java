package com.example.restauracja.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    private Position position;
    private Boolean isFree = true;
    private Short clientNumber;

    @Column(unique = true)
    private String email;

    @OneToMany
    List<Client> clients;

}
//{
//    "name" : "Tomasz",
//    "salary" : 12000
//        }