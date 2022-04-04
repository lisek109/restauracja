package com.example.restauracja.service;

import com.example.restauracja.repository.EmployeeRepo;
import com.example.restauracja.entities.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public Employee findById(Long id) {
        return employeeRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    public boolean deleteById(Long id) {
        employeeRepo.delete(findById(id));
        return true;
    }

    public List<Employee> findAllByIsFree(Boolean isFree) {
       return employeeRepo.findAllByIsFree(isFree);
    }

    public Optional<Employee> findByIsFree(Boolean isFree) {
        return employeeRepo.findByIsFree(isFree);
    }



}

