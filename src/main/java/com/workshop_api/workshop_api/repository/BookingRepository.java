package com.workshop_api.workshop_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop_api.workshop_api.entities.Bookings;

public interface BookingRepository extends JpaRepository<Bookings, Integer> {
    
}
