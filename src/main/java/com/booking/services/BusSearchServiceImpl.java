package com.booking.services;

import com.booking.entities.Bus;
import com.booking.repository.BusRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BusSearchServiceImpl implements BusSearchService {

    private final BusRepository busRepository;

    public BusSearchServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public List<Bus> searchBuses(String source, String destination, LocalDate travelDate) {
        // Implementation to fetch bus data from the database based on source, destination, and travel date
        return busRepository.findBusesBySourceAndDestinationAndTravelDate(source, destination, travelDate);
    }
}

