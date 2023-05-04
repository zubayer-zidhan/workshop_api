package com.workshop_api.workshop_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop_api.workshop_api.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
    
}
