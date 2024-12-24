package com.saisahith.bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name="theatre_seats")
public class Seat extends BaseModel{
    public String seatName;
    @ManyToOne
    public SeatType seatType;
    public int rowVal;
    public int colVal;
}
