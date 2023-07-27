package com.booking.entities;

import java.util.List;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequest {
    private String busId;
    private List<String> seatNumbers;
    private String userId;
}


