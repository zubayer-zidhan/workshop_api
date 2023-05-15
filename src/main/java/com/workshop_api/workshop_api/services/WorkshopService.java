package com.workshop_api.workshop_api.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.workshop_api.workshop_api.entities.Workshops;

@Service
public interface WorkshopService {
    //Methods name
    public List<Workshops> getAllWorkshops();
    public List<Workshops> getWorkshopsByCity(int cid);
    public Workshops addWorkshop(Workshops workshop);
}
