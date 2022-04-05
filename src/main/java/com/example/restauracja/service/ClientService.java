package com.example.restauracja.service;

import com.example.restauracja.entities.Client;
import com.example.restauracja.entities.Employee;
import com.example.restauracja.repository.ClientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {


    private final ClientRepo clientRepo;
    private final EmployeeService employeeService;

    public Client save(Client client) {
        return clientRepo.save(client);
    }

    public List<Client> findAll() {
        return clientRepo.findAll();
    }

    public Client findById(Long id) {
        return clientRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    public boolean deleteById(Long id) {
        clientRepo.delete(findById(id));
        return true;
    }

    public Boolean saveEmployee(Long id) {
        Client client = clientRepo.getById(id);
        Employee employee1 = employeeService.findByIsFree(true);
        if (employee1 != null) {
            client.setEmployee(employee1);
            return true;
        }
        return false;
    }
}

