package com.example.restauracja.web;

import com.example.restauracja.entities.Employee;
import com.example.restauracja.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable final Long id) {
        return ResponseEntity.ok(employeeService.findById(id));
    }

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.findAll();
    }
   // public ResponseEntity<List<Employee>> getAll() {
   //     return ResponseEntity.ok(employeeService.findAll());
   // }

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody final Employee employee) {
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable final Long id) {
        return ResponseEntity.ok(employeeService.deleteById(id));
    }


}
