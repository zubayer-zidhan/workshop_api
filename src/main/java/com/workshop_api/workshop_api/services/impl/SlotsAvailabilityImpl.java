package com.workshop_api.workshop_api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.SlotsAvailability;
import com.workshop_api.workshop_api.repository.SlotsAvailabilityRepository;
import com.workshop_api.workshop_api.services.SlotsAvailabilityService;

@Service
public class SlotsAvailabilityImpl implements SlotsAvailabilityService {
    @Autowired
    SlotsAvailabilityRepository slotsAvailabilityRepository;

    @Override
    public List<SlotsAvailability> getSlotsAvailabilityDetails() {
        return slotsAvailabilityRepository.findAll();
    }

    
}
