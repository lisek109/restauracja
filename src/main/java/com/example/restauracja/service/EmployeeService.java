package com.example.restauracja.service;

import com.example.restauracja.entities.Employee;
import com.example.restauracja.entities.Position;
import com.example.restauracja.repository.EmployeeRepo;
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
        return employeeRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    public boolean deleteById(Long id) {
        employeeRepo.delete(findById(id));
        return true;
    }

    public Employee findEmployee() {
        return employeeRepo.findFirstByPositionOrPositionAndClientNumberLessThanOrderByClientNumberAsc(
                Position.BARTENDER.toString(), Position.WAITER.toString(), 3)
                .orElseThrow(() -> new RuntimeException("There is no free employee right now"));
    }


}

