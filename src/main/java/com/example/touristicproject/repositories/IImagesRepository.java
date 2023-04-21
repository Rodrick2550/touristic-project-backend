package com.example.touristicproject.repositories;

import com.example.touristicproject.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImagesRepository extends JpaRepository<Image, Long> {
}
