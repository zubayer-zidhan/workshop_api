package com.workshop_api.workshop_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.SlotsAvailability;

@Service
public interface SlotsAvailabilityService {
   public List<SlotsAvailability> getSlotsAvailabilityDetails(); 
}
