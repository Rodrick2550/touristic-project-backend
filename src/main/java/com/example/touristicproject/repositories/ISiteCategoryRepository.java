package com.example.touristicproject.repositories;

import com.example.touristicproject.entities.pivots.SiteCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISiteCategoryRepository extends JpaRepository<SiteCategory, Long> {
}
