package com.example.touristicproject.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "images")
@Getter
@Setter
public class Image {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long id;

    @Column
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "site_id")
    @JsonBackReference
    private Site site;

}
