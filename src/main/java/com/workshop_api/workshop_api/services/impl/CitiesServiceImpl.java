package com.workshop_api.workshop_api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.Cities;
import com.workshop_api.workshop_api.repository.CitiesRepository;
import com.workshop_api.workshop_api.services.CitiesService;

@Service
public class CitiesServiceImpl implements CitiesService {

    @Autowired
    CitiesRepository citiesRepository;

    @Override
    public List<Cities> getAllCities() {
     
        return citiesRepository.findAll();
    }

    @Override
    public Cities addCities(Cities cities) {
        return citiesRepository.save(cities);
    }
    
}
