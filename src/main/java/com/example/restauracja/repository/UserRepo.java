package com.example.restauracja.repository;

import com.example.restauracja.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, String> {

    Optional<User> findByUserName(String username);
}
