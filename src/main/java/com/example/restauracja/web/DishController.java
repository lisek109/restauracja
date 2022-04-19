package com.example.restauracja.web;


import com.example.restauracja.entities.Dish;
import com.example.restauracja.service.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/restaurant/dish")
public class DishController {

    private final DishService dishService;

    @GetMapping("/{id}")
    public ResponseEntity<Dish> getById(@PathVariable Long id) {
        return ResponseEntity.ok(dishService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Dish>> getAll() {
        return ResponseEntity.ok(dishService.findAll());
    }

    @PostMapping
    public ResponseEntity<Dish> save(@RequestBody Dish dish) {
        return ResponseEntity.ok(dishService.save(dish));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return ResponseEntity.ok(dishService.deleteById(id));
    }
}
