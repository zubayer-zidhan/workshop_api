package com.workshop_api.workshop_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop_api.workshop_api.entities.Bookings;
import com.workshop_api.workshop_api.services.BookingService;

@RestController
public class BookingController {
   
    @Autowired
    BookingService bookingService;
    
    // Route
    @GetMapping("/bookings")
    public List<Bookings> getBookingsDetails(){
        return bookingService.getBookingsDetails();
    }
}
