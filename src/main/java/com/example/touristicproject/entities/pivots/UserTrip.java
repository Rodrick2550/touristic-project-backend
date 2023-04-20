package com.example.touristicproject.entities.pivots;
import com.example.touristicproject.entities.Trip;
import com.example.touristicproject.entities.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users_trips")
@Getter
@Setter
public class UserTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    @JsonBackReference
    private Trip trip;

}
