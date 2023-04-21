package com.example.touristicproject.repositories;

import com.example.touristicproject.entities.TripStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITripStatusRepository extends JpaRepository<TripStatus, Long> {
}
