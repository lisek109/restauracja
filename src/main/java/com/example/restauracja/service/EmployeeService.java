package com.example.restauracja.service;

import com.example.restauracja.entities.Client;
import com.example.restauracja.entities.Employee;
import com.example.restauracja.entities.Position;
import com.example.restauracja.repository.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final ClientService clientService;


    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Transactional
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
//
    //  public Employee findEmployee() {
    //      return employeeRepo.findFirstByPositionOrPositionAndClientNumberLessThanOrderByClientNumberAsc(
    //              Position.BARTENDER.toString(), Position.WAITER.toString(), 3)
    //              .orElseThrow(() -> new RuntimeException("There is no free employee right now"));
    //  }

    public Employee saveClient(Long id) {
        Client client = clientService.findById(id);
        Employee employee = employeeRepo.
                findFirstByPositionOrPositionAndClientNumberLessThanOrderByClientNumberAsc
                        ("BARTENDER", "WAITER", 3).orElseThrow(RuntimeException::new);
        employee.getClients().add(client);
        employee.setClientNumber((short) (employee.getClientNumber() + 1));
        return employeeRepo.save(employee);
    }

}

