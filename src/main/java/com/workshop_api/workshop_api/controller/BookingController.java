package com.workshop_api.workshop_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.workshop_api.workshop_api.entities.Bookings;
import com.workshop_api.workshop_api.services.BookingService;

@CrossOrigin(value = "http://localhost:3000")
@RestController
public class BookingController {
   
    @Autowired
    BookingService bookingService;

    // Route
    @GetMapping("/getBookings")
    public List<Bookings> getBookingsDetails(){
        return bookingService.getBookingsDetails();
    }

    // Post Request for Booking Using Workshop ID
    @PostMapping("/book-with-workshopid")
    public String bookWithWorkshopId(
        @RequestParam("wid") int wid,
        @RequestParam("uid") int uid,
        @RequestParam("bdate") String bdate
    ) {
        return bookingService.bookWithWorkshopId(wid, uid, bdate);
    }

    
    //Post Request for Booking Using City ID
    @PostMapping("/book-with-cityid")
    public String bookWithCityId(
        @RequestParam("cid") int cid,
        @RequestParam("uid") int uid,
        @RequestParam("bdate") String bdate
    ) {
       
        return bookingService.bookWithCityId(cid, uid, bdate);
    }


}
