package com.workshop_api.workshop_api.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "bookings")
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int workshop_id;
    private int user_id;
    private String booking_date;
    private String date_created;
    public int getId() {
        return id;
    }
   
    public void setId(int id) {
        this.id = id;
    }

    public int getWorkshop_id() {
        return workshop_id;
    }

    public void setWorkshop_id(int workshop_id) {
        this.workshop_id = workshop_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    
}
