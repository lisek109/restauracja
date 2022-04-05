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

    public Client saveRandomEmployee(Long id) {
        Client client = clientRepo.getById(id);
        Employee employee = employeeService.findEmployee();
        client.setEmployee(employee);
        return clientRepo.save(client);
    }

    public Client saveEmployee(Long clientID, Employee employee) {
        Client client = clientRepo.getById(clientID);
        client.setEmployee(employee);
        clientRepo.save(client);
        return client;
    }
}

