package com.saisahith.bookmyshow.controllers;

import com.saisahith.bookmyshow.models.Seat;
import com.saisahith.bookmyshow.models.SeatType;
import com.saisahith.bookmyshow.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SeatController {

    @Autowired
    public SeatService seatService;

    public Seat createSeat(int rowVal, int colVal, String seatName, String seatType) {


        return seatService.createSeat(rowVal, colVal, seatName, seatType);

    }
}
