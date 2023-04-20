package com.example.touristicproject.entities;

import com.example.touristicproject.entities.pivots.SiteCategory;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "sites")
@Getter
@Setter
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String name;

    @Column
    private String description;

    @Column(length = 150)
    private String address;

    @Column(length = 150)
    private String coordinates;

    @OneToMany(mappedBy = "site", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Image> images;

    @OneToMany(mappedBy = "site", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<SiteCategory> siteCategories;
}
