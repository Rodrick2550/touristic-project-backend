package com.example.touristicproject.repositories;

import com.example.touristicproject.entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITripRepository extends JpaRepository<Trip, Long> {

}
