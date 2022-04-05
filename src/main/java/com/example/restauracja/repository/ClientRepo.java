package com.example.restauracja.repository;

import com.example.restauracja.entities.Client;
import com.example.restauracja.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepo extends JpaRepository<Client, Long> {


  // @Query(value = "INSERT INTO client (employee) VALUES ( :value )", nativeQuery = true);

  // void saveEmployee(@Param("employee")Employee);


    public void saveEmployee(Employee employee);


}
