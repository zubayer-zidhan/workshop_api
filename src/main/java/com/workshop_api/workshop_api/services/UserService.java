package com.workshop_api.workshop_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.Users;

@Service
public interface UserService {
    public List<Users> getUserDetails();
    public Users addUser(Users user);
    public String findUserId(String name, String email);
}
