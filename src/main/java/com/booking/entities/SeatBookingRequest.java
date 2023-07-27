package com.booking.entities;

import java.util.List;

public class SeatBookingRequest {
    private String busId;
    private List<String> seatNumbers;
    private String userId;

    // Constructors, getters, and setters

    public SeatBookingRequest(String busId, List<String> seatNumbers, String userId) {
        this.busId = busId;
        this.seatNumbers = seatNumbers;
        this.userId = userId;
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public List<String> getSeatNumbers() {
        return seatNumbers;
    }

    public void setSeatNumbers(List<String> seatNumbers) {
        this.seatNumbers = seatNumbers;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

