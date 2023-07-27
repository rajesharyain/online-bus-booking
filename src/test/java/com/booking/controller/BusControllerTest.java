package com.booking.controller;

import com.booking.entities.Bus;
import com.booking.services.BusSearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BusControllerTest {

    @Mock
    private BusSearchService busService;

    @InjectMocks
    private BusController busController;

    @Test
    public void testSearchBusesWithDummyData() {
        // Dummy data
        String source = "City A";
        String destination = "City B";
        LocalDate travelDate = LocalDate.of(2023, 8, 1);

        // Create dummy bus objects
        Bus bus1 = new Bus();
        bus1.setId(1L);
        bus1.setName("Bus A");
        bus1.setType("AC");
        // Set other properties...

        Bus bus2 = new Bus();
        bus2.setId(2L);
        bus2.setName("Bus B");
        bus2.setType("Non-AC");
        // Set other properties...

        List<Bus> dummyBuses = Arrays.asList(bus1, bus2);

        // Mock the busService's searchBuses method to return dummyBuses when called with dummy data
        when(busService.searchBuses(source, destination, travelDate)).thenReturn(dummyBuses);

        // Perform the searchBuses API call
        ResponseEntity<List<Bus>> responseEntity = busController.searchBuses(source, destination, travelDate);

        // Assert the response
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(dummyBuses, responseEntity.getBody());
    }
}

