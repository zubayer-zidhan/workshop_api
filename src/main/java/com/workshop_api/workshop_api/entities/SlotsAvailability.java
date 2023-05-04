package com.workshop_api.workshop_api.entities;

import com.workshop_api.workshop_api.keys.SlotsAvailabilityKey;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;


// IdClass for Composite Key
@Entity
@Table(name = "slots_availability")
@IdClass(SlotsAvailabilityKey.class)
public class SlotsAvailability {
    @Id
    @Column(name = "workshop_id")
    private int workshop_id;

    @Id
    @Column(name = "date")
    private String date;

    private int available_slots;

    
    public int getWorkshop_id() {
        return workshop_id;
    }

    public void setWorkshop_id(int workshop_id) {
        this.workshop_id = workshop_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAvailable_slots() {
        return available_slots;
    }

    public void setAvailable_slots(int available_slots) {
        this.available_slots = available_slots;
    }


}

