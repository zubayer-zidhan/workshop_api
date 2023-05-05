package com.workshop_api.workshop_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.workshop_api.workshop_api.entities.Bookings;
import com.workshop_api.workshop_api.services.BookingService;

@RestController
public class BookingController {
   
    @Autowired
    BookingService bookingService;

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookingController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    
    // Route
    @GetMapping("/bookings")
    public List<Bookings> getBookingsDetails(){
        return bookingService.getBookingsDetails();
    }

    @PostMapping("/book-with-workshopid")
    @ResponseBody
    public String bookWithWorkshopId(
        @RequestParam("wid") int wid,
        @RequestParam("uid") int uid,
        @RequestParam("bdate") String bdate

    ) {
        int op = jdbcTemplate.queryForObject(
            "CALL book_with_workshop_id(?, ?, ?)",
            Integer.class, 
            wid, 
            uid, 
            bdate
        );

        String outputMessage;

        if(op == 10) {
            outputMessage = "SUCCESS";
        }  else {
            if(op == 20) {
                outputMessage = "No Slots Available on given date";
            } else {
                outputMessage = "UNSUCCESSFUL"; 
            }
        }  

        return outputMessage;
    }
}
