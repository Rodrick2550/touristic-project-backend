package com.example.touristicproject.controllers.dtos.requests;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class UpdateSiteRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private String address;

}
