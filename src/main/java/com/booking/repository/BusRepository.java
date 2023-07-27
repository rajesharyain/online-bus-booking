package com.booking.repository;

import com.booking.entities.Bus;
import com.booking.entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {

    // Custom query method to find available buses based on source, destination, and travel date
    List<Bus> findBusesBySourceAndDestinationAndTravelDate(String source, String destination, LocalDate travelDate);

    // Custom query method to find available seats for a specific bus
    List<Seat> findAvailableSeatsByBusId(String busId);

    // Add more custom query methods as needed
}
