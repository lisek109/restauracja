package com.example.restauracja.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dish_id")
    private Long id;
    private String name;
    private Integer price;
    private Integer points;

    @Enumerated(EnumType.STRING)
    private DishTYpe dishTYpe;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "orders_dishes",
    joinColumns = {@JoinColumn(name = "order_id")},
    inverseJoinColumns = {@JoinColumn(name = "dish_id")})
    private List<Order> ordersList;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "dishes")
    private List<Ingredient> ingredients;
}
