package com.example.touristicproject.repositories;

import com.example.touristicproject.entities.pivots.UserTrip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserTripRepository extends JpaRepository<UserTrip, Long> {
}
