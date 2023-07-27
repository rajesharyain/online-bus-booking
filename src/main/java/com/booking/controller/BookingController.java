package com.booking.controller;

import com.booking.entities.BookingRequest;
import com.booking.services.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<?> createBooking(@RequestBody BookingRequest bookingRequest) {
        boolean bookingResult = bookingService.createBooking(bookingRequest);

        if (bookingResult) {
            return ResponseEntity.ok("Booking created successfully!");
        } else {
            return ResponseEntity.badRequest().body("Booking creation failed. Please try again.");
        }
    }
}
