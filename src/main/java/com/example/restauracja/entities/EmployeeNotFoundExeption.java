package com.example.restauracja.entities;

public class EmployeeNotFoundExeption extends RuntimeException{

    public EmployeeNotFoundExeption(final String message) {
        super(message);
    }
}
