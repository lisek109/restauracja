package com.example.restauracja.web;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        return e.getMessage();
    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    public String indexException(IndexOutOfBoundsException ie) {
        return "Index out of bounds exeption" + ie.getMessage();
    }

    @ExceptionHandler(NullPointerException.class)
    public String nullPointerException(NullPointerException e) {
        return "You've got null!" + e.getMessage();
    }
}
