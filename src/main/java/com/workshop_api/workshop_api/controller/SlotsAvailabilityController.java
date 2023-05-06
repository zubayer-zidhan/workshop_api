package com.workshop_api.workshop_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.workshop_api.workshop_api.entities.SlotsAvailability;
import com.workshop_api.workshop_api.services.SlotsAvailabilityService;

@RestController
public class SlotsAvailabilityController {
    @Autowired
    SlotsAvailabilityService slotsAvailabilityService;

    // Get the all data from "slots-availability-table"
    @GetMapping("/slots-availability")
    public List<SlotsAvailability> getSlotsAvailabilityDetails() {
        return slotsAvailabilityService.getSlotsAvailabilityDetails();
    }
    

    // Get total number of available slots for a given workshop-id
    @GetMapping("/available-slots-workshop/{bdate}/{id}")
    public String getAvailableSlotsInWorkshop(
        @PathVariable("bdate") String bdate,
        @PathVariable("id") int id
    ) {
        return slotsAvailabilityService.getAvailableSlotsInWorkshop(id, bdate);
    }


    // Get total number of available slots for a given workshop-id
    @GetMapping("/available-slots-city/{bdate}/{id}")
    public String getAvailableSlotsInCity(
        @PathVariable("bdate") String bdate,
        @PathVariable("id") int id
    ) {
        return slotsAvailabilityService.getAvailableSlotsInCity(id, bdate);
    }
}
