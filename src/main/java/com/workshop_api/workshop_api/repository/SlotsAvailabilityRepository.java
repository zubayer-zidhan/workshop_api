package com.workshop_api.workshop_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop_api.workshop_api.entities.SlotsAvailability;
import com.workshop_api.workshop_api.keys.SlotsAvailabilityKey;

public interface SlotsAvailabilityRepository extends JpaRepository<SlotsAvailability, SlotsAvailabilityKey>{
    
}
