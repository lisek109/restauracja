package com.example.restauracja.repository;

import com.example.restauracja.web.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
