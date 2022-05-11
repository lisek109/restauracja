package com.example.restauracja.web;


import com.example.restauracja.entities.User;
import com.example.restauracja.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Boolean> deleteUser(@PathVariable String id) {
        return ResponseEntity.ok(userService.deleteById(id));
    }
}
