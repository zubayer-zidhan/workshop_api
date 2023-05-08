package com.workshop_api.workshop_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.Cities;

@Service
public interface CitiesService {
    public List<Cities> getAllCities();
    public Cities addCities(Cities cities);
}
