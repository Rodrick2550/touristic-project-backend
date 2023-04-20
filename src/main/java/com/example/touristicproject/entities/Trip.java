package com.example.touristicproject.entities;

import com.example.touristicproject.entities.pivots.UserTrip;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "trips")
@Getter
@Setter
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<UserTrip> userTrips ;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    @ManyToOne
    @JoinColumn(name = "tripsStatus_id")
    @JsonBackReference
    private TripStatus tripStatus;



}
