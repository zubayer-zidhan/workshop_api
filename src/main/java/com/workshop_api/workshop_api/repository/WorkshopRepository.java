package com.workshop_api.workshop_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop_api.workshop_api.entities.Workshops;

@Repository
public interface WorkshopRepository extends JpaRepository<Workshops, Integer>{
    
}
