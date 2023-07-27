package com.booking.controller;

import com.booking.entities.Bus;
import com.booking.services.BusSearchService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/buses")
public class BusController {

    private final BusSearchService busSearchService;

    public BusController(BusSearchService busSearchService) {
        this.busSearchService = busSearchService;
    }

    @GetMapping
    public ResponseEntity<List<Bus>> searchBuses(@RequestParam String source,
                                                 @RequestParam String destination,
                                                 @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate travelDate) {
        List<Bus> buses = busSearchService.searchBuses(source, destination, travelDate);

        if (buses.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(buses);
        }
    }
}
