package com.example.touristicproject.controllers.dtos.requests;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class UpdateImageRequest {
    @NotNull
    private String imageUrl;
}
