package com.workshop_api.workshop_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop_api.workshop_api.entities.SlotsAvailability;
import com.workshop_api.workshop_api.services.SlotsAvailabilityService;

@RestController
public class SlotsAvailabilityController {
    @Autowired
    SlotsAvailabilityService slotsAvailabilityService;

    @GetMapping("/slots-availability")
    public List<SlotsAvailability> getSlotsAvailabilityDetails() {
        return slotsAvailabilityService.getSlotsAvailabilityDetails();
    }
}
