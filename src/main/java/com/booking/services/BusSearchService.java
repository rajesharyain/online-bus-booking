package com.booking.services;

import com.booking.entities.Bus;

import java.time.LocalDate;
import java.util.List;

public interface BusSearchService {
    List<Bus> searchBuses(String source, String destination, LocalDate travelDate);
}

