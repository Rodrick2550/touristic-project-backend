package com.example.touristicproject.entities.pivots;

import com.example.touristicproject.entities.Category;
import com.example.touristicproject.entities.Site;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sites_categories")
@Getter
@Setter
public class SiteCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonBackReference
    private Category category;

    @ManyToOne
    @JoinColumn(name = "site_id")
    @JsonBackReference
    private Site site;
}
