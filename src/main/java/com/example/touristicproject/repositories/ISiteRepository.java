package com.example.touristicproject.repositories;

import com.example.touristicproject.entities.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISiteRepository extends JpaRepository<Site, Long> {
}
