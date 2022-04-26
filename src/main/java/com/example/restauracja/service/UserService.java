package com.example.restauracja.service;

import com.example.restauracja.entities.User;
import com.example.restauracja.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepo userRepo;

    public User save(User user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());

        user.setPassword(encodedPassword);

        return userRepo.save(user);
    }

    public boolean deleteById(String id) {
         userRepo.deleteById(id);
         return true;
    }
}
