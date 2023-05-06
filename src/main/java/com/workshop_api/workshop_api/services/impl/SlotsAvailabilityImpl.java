package com.workshop_api.workshop_api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.SlotsAvailability;
import com.workshop_api.workshop_api.repository.SlotsAvailabilityRepository;
import com.workshop_api.workshop_api.services.SlotsAvailabilityService;

@Service
public class SlotsAvailabilityImpl implements SlotsAvailabilityService {
    @Autowired
    SlotsAvailabilityRepository slotsAvailabilityRepository;

    JdbcTemplate jdbcTemplate;

    public SlotsAvailabilityImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<SlotsAvailability> getSlotsAvailabilityDetails() {
        return slotsAvailabilityRepository.findAll();
    }

    @Override
    public String getAvailableSlotsInWorkshop(int wid, String bdate) {
        int availableSlots = jdbcTemplate.queryForObject(
            "CALL available_slots_in_workshop(?, ?)", 
            Integer.class, 
            wid,
            bdate
        );
        return "There are '" + availableSlots + "' slots available in workshop with id=" + wid + ".";
    }

    @Override
    public String getAvailableSlotsInCity(int cid, String bdate) {
        int availableSlots = jdbcTemplate.queryForObject(
            "CALL available_slots_in_city(?, ?)", 
            Integer.class, 
            cid,
            bdate
        );
        return "There are '" + availableSlots + "' slots available in workshop with id=" + cid + " on date=" + bdate + ".";
    }

    
}
