package com.example.touristicproject.services.interfaces;

import com.example.touristicproject.controllers.dtos.requests.CreateUserRequest;
import com.example.touristicproject.controllers.dtos.requests.UpdateUserRequest;
import com.example.touristicproject.controllers.dtos.responses.BaseResponse;
import com.example.touristicproject.entities.User;

public interface IUserService {
    BaseResponse create(CreateUserRequest request);

    BaseResponse get( Long id);

    BaseResponse update(UpdateUserRequest request, Long id);

    BaseResponse delete (Long id);

    User findOneAndEnsureExistById(Long id);
}
