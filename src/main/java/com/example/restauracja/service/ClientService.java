package com.example.restauracja.service;

import com.example.restauracja.entities.Employee;
import com.example.restauracja.repository.ClientRepo;
import com.example.restauracja.entities.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {


    private final ClientRepo clientRepo;

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


}
