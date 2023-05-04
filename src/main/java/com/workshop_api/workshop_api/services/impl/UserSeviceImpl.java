package com.workshop_api.workshop_api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.Users;
import com.workshop_api.workshop_api.repository.UserRepository;
import com.workshop_api.workshop_api.services.UserService;

@Service
public class UserSeviceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<Users> getUserDetails() {
        return userRepository.findAll();
    }
    
    
}
