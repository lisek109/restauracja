package com.example.restauracja.service;

import com.example.restauracja.repository.EmployeeRepo;
import com.example.restauracja.web.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return employeeRepo.findById(id);
    }

    public boolean deleteById(Long id) {
        return employeeRepo.deleteById(id);
    }
}

