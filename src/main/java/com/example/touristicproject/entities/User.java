package com.example.touristicproject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(length = 50)
    private String email;

    @Column(length = 100)
    private String passwword;

    @Column(length = 40)
    private String firstName;

    @Column(length = 40)
    private String lastName;
}
