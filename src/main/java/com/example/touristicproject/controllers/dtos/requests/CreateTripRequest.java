package com.example.touristicproject.controllers.dtos.requests;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
public class CreateTripRequest {

    @NotBlank
    @NotNull
    private Date date;


}
