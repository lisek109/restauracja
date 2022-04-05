package com.example.restauracja.service;


import com.example.restauracja.entities.Ingredient;
import com.example.restauracja.repository.IngredientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class IngredientsService {

    private final IngredientRepo ingredientRepo;

    public Ingredient save(Ingredient ingredient) {
       return ingredientRepo.save(ingredient);
    }

    public Ingredient findById(Long id) {
        return ingredientRepo.findById(id).orElseThrow(() -> new RuntimeException("Cannot find ingredient with given id"));
    }

    public Boolean deleteById(Long id) {
        ingredientRepo.delete(findById(id));
        return true;
    }
}
