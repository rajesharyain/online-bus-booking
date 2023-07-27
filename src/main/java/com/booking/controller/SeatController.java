package com.booking.controller;

import com.booking.entities.Seat;
import com.booking.entities.SeatBookingRequest;
import com.booking.services.SeatSelectionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seats")
public class SeatController {

    private final SeatSelectionService seatSelectionService;

    public SeatController(SeatSelectionService seatSelectionService) {
        this.seatSelectionService = seatSelectionService;
    }

    @GetMapping("/{busId}")
    public ResponseEntity<List<Seat>> getAvailableSeats(@PathVariable String busId) {
        List<Seat> availableSeats = seatSelectionService.getAvailableSeats(busId);

        if (availableSeats.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(availableSeats);
        }
    }

    @PostMapping("/book")
    public ResponseEntity<?> bookSeats(@RequestBody SeatBookingRequest seatBookingRequest) {
        boolean bookingResult = seatSelectionService.bookSeats(
                seatBookingRequest.getBusId(),
                seatBookingRequest.getSeatNumbers(),
                seatBookingRequest.getUserId()
        );

        if (bookingResult) {
            return ResponseEntity.ok("Seats booked successfully!");
        } else {
            return ResponseEntity.badRequest().body("Seat booking failed. Please try again.");
        }
    }
}

