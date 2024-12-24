package com.saisahith.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Booking extends BaseModel{
    @ManyToOne
    private User user;
    @OneToMany
    private List<ShowSeat> showSeatList;
    private Date bookedAt;
    private int amount;
    @OneToMany
    private List<Payment> payments;
    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

}
