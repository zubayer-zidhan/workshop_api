package com.workshop_api.workshop_api.keys;

import java.io.Serializable;


// For Composite Key in case of SlotsAvailabilityKey
public class SlotsAvailabilityKey implements Serializable {
    private int workshop_id;
    private String date;

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

}