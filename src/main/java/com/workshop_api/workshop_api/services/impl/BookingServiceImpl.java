package com.workshop_api.workshop_api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.Bookings;
import com.workshop_api.workshop_api.repository.BookingRepository;
import com.workshop_api.workshop_api.services.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    BookingRepository bookingRepository;

    @Override
    public List<Bookings> getBookingsDetails() {
        return bookingRepository.findAll();
    }
    
}
