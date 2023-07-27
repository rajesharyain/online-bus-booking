package com.booking.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bus_id", referencedColumnName = "id")
    private Bus bus;

    @Column(name = "seat_numbers")
    private String seatNumbers;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "booking_time")
    private LocalDateTime bookingTime;

    // Constructors, getters, and setters

    // Other properties and methods
}

