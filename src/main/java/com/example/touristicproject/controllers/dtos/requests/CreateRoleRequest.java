package com.example.touristicproject.controllers.dtos.requests;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
public class CreateRoleRequest {
    @NotBlank
    @NotNull
    private String name;
}
