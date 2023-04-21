package com.example.touristicproject.controllers.dtos.requests;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class CreateImageRequest {

    @NotNull
    private String imageUrl;
}
