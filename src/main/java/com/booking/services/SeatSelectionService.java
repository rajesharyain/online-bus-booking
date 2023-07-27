package com.booking.services;

import com.booking.entities.Seat;

import java.util.List;

public interface SeatSelectionService {
    List<Seat> getAvailableSeats(String busId);
    boolean bookSeats(String busId, List<String> seatNumbers, String userId);
}

