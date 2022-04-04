package com.example.restauracja.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    private Integer calories;
    private Integer weight;
    private String category;
    private String type;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ingredients_dishes",
    joinColumns = {@JoinColumn(name = "ingredient_id")},
    inverseJoinColumns = {@JoinColumn(name = "dish_id")})
    private List<Dish> dishes;

}
