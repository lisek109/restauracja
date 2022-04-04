package com.example.restauracja.repository;

import com.example.restauracja.entities.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepo extends JpaRepository<Dish, Long> {
}
