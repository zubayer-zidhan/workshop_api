package com.workshop_api.workshop_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop_api.workshop_api.services.WorkshopService;
import com.workshop_api.workshop_api.entities.Workshops;
import java.util.List;

@RestController
public class WorkshopController {
    
    @Autowired
    WorkshopService workshopService;
    
    @GetMapping("/workshop")
    public List<Workshops> getWorkshops(){
        return workshopService.getAllWorkshops();
    }

   
}
