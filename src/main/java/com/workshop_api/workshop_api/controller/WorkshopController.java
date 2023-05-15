package com.workshop_api.workshop_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.workshop_api.workshop_api.services.WorkshopService;

import com.workshop_api.workshop_api.entities.Workshops;
import java.util.List;
@CrossOrigin(value = "http://localhost:3000")
@RestController
public class WorkshopController {
    
    @Autowired
    WorkshopService workshopService;
   
    @GetMapping("/getWorkshops")
    public List<Workshops> getWorkshops(){
        return workshopService.getAllWorkshops();
    }


    @GetMapping("/getWorkshopsByCity")
    public List<Workshops> getWorkshopsByCity(@RequestParam("city_id") int city_id){
        return workshopService.getWorkshopsByCity(city_id);
    }


    @PostMapping("/addWorkshop")
    public Workshops addWorkshop(
        @RequestParam("name") String name,
        @RequestParam("total_slots") int total_slots,
        @RequestParam("city_id") int city_id
    ){
        Workshops workshop = new Workshops(0, name, total_slots, city_id);
        return workshopService.addWorkshop(workshop);
    }
    

   
}
