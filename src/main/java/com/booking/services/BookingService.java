package com.booking.services;

import com.booking.entities.BookingRequest;

public interface BookingService {
    boolean createBooking(BookingRequest bookingRequest);
}

