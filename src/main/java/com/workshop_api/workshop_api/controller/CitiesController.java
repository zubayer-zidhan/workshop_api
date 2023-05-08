package com.workshop_api.workshop_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.workshop_api.workshop_api.entities.Cities;
import com.workshop_api.workshop_api.services.CitiesService;

@RestController
public class CitiesController {

    @Autowired
    CitiesService citiesService;
    
    @GetMapping("/getCities")
    public List<Cities> getAllCities(){
        return citiesService.getAllCities();
    }

    @PostMapping("/addCity")
    public Cities addCities(
        @RequestParam("name") String name
    ){
        Cities cities = new Cities(0, name);
        return citiesService.addCities(cities);
    }
    
}
