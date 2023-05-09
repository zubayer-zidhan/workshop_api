package com.workshop_api.workshop_api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.Bookings;
import com.workshop_api.workshop_api.repository.BookingRepository;
import com.workshop_api.workshop_api.services.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    BookingRepository bookingRepository;

    private final JdbcTemplate jdbcTemplate;

    public BookingServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    //method to show booking details
    @Override
    public List<Bookings> getBookingsDetails() {
        return bookingRepository.findAll();
    }
    //Method to book-with-workshop-id
    @Override
    public String bookWithWorkshopId(int wid, int uid, String bdate) {
        int outputValue = jdbcTemplate.queryForObject(
            "CALL book_with_workshop_id(?, ?, ?)",
            Integer.class, 
            wid,
            uid,
            bdate
        );

        String outputMessage;

        if(outputValue == 10) {
            outputMessage = "SUCCESS";
        }  else {
            if(outputValue == 20) {
                outputMessage = "No Slots Available at the required workshop on the given date";
            } else {
                outputMessage = "UNSUCCESSFUL"; 
            }
        }  

        return outputMessage;
    }

    //Method to book-with-city-id
    @Override
    public String bookWithCityId(int cid, int uid, String bdate) {
        int outputValue = jdbcTemplate.queryForObject(
            "CALL book_with_city_id(?, ?, ?)",
            Integer.class, 
            cid,
            uid,
            bdate
        );

        String outputMessage;

        if(outputValue == 10) {
            outputMessage = "SUCCESS";
        }  else {
            if(outputValue == 20) {
                outputMessage = "No Slots Available at the required city on the given date";
            } else {
                outputMessage = "UNSUCCESSFUL"; 
            }
        }  
        
        return outputMessage;

    }
        
    }
    

