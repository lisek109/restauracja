package com.example.restauracja.service;


import com.example.restauracja.repository.OrderRepo;
import com.example.restauracja.entities.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepo orderRepo;

    public Order save(Order order) {
        return orderRepo.save(order);
    }

    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    public Order findById(Long id) {
        return orderRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    public Boolean deleteById(Long id) {
        orderRepo.delete(findById(id));
        return true;
    }
}
