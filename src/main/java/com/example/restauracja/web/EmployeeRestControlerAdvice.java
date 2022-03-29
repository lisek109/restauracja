package com.example.restauracja.web;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeRestControlerAdvice {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        return e.getMessage();
    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    public String indexExeption(IndexOutOfBoundsException ie) {
        return "Index out of bounds exeption" + ie.getMessage();
    }
}
