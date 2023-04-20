package com.example.touristicproject.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "trip_Status")
@Getter
@Setter
public class TripStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;

    @OneToMany(mappedBy = "trip_Status", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Trip> trips;
}
