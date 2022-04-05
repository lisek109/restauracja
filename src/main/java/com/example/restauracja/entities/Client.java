package com.example.restauracja.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.ToOne;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    @Email
    @Length
    private String email;
    @OneToOne
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empl_id", referencedColumnName = "employee_id")
    private Employee employee;
}
