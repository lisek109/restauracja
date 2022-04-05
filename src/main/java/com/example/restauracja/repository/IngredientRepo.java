package com.example.restauracja.repository;

import com.example.restauracja.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepo extends JpaRepository<Ingredient, Long>{
}
