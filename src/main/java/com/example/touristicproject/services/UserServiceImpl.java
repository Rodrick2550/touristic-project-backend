package com.example.touristicproject.services;

import com.example.touristicproject.controllers.dtos.requests.CreateUserRequest;
import com.example.touristicproject.controllers.dtos.responses.BaseResponse;
import com.example.touristicproject.repositories.IUserRepository;
import com.example.touristicproject.repositories.IUserTripRepository;
import com.example.touristicproject.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository repository;

    @Autowired
    private IUserTripRepository userTripService;

    @Override
    public BaseResponse create(CreateUserRequest request){
        if (repository.existByEmail(request.g))
    }


}
