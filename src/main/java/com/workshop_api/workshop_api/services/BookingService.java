package com.workshop_api.workshop_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.Bookings;

@Service
public interface BookingService {
    public List<Bookings> getBookingsDetails();
    public String bookWithWorkshopId(int wid,int uid,String bdate);
    public String bookWithCityId(int wid,int uid,String bdate);
    
}
