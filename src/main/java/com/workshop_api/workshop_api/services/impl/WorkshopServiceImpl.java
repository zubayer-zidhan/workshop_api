package com.workshop_api.workshop_api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.Workshops;
import com.workshop_api.workshop_api.repository.WorkshopRepository;
import com.workshop_api.workshop_api.services.WorkshopService;

@Service
public class WorkshopServiceImpl implements WorkshopService {
    @Autowired
    WorkshopRepository workshopRepository;

    //Methods implementation
    @Override
    public List<Workshops> getAllWorkshops() {
        // TODO Auto-generated method stub
        return workshopRepository.findAll();  //calling findAll() from Jparepository
    }

    @Override
    public Workshops addWorkshop(Workshops workshop) {
        return workshopRepository.save(workshop);
    }
    
}
