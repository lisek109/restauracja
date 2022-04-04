package com.example.restauracja.service;

import com.example.restauracja.repository.DishRepo;
import com.example.restauracja.entities.Dish;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishService {

    private final DishRepo dishRepo;

    public Dish save(Dish dish) {
        return dishRepo.save(dish);
    }

    public List<Dish> findAll() {
        return dishRepo.findAll();
    }

    public Dish findById(Long id) {
        return dishRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    public boolean deleteById(Long id) {
        dishRepo.delete(findById(id));
        return true;
    }
}
