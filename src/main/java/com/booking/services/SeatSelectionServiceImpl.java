package com.booking.services;

import com.booking.entities.Seat;
import com.booking.repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatSelectionServiceImpl implements SeatSelectionService {

    private final BusRepository busRepository;

    public SeatSelectionServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public List<Seat> getAvailableSeats(String busId) {
        // Implementation to fetch available seats for a specific bus from the database
        return busRepository.findAvailableSeatsByBusId(busId);
    }

    @Override
    public boolean bookSeats(String busId, List<String> seatNumbers, String userId) {
        // Implementation to book selected seats for a specific bus in the database
        // Update seat status and create a new booking record
        // Return true if booking is successful; otherwise, return false
        return true;
    }
}
