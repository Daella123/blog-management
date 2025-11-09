package com.example.blogmanagement.service;

import com.example.blogmanagement.dto.UserRegistrationRequest;
import com.example.blogmanagement.dto.UserResponseDto;


public interface UserService {


    UserResponseDto registerUser(UserRegistrationRequest request);


    UserResponseDto getUserById(Long userId);


    void deleteUser(Long userId);
}