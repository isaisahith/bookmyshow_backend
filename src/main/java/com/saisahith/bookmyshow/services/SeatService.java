package com.saisahith.bookmyshow.services;

import com.saisahith.bookmyshow.models.Seat;
import com.saisahith.bookmyshow.models.SeatType;
import com.saisahith.bookmyshow.repositories.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    public SeatRepository seatRepository;

    public Seat createSeat(int rowVal, int colVal, String seatName, String seatType) {

        SeatType seatType1 = new SeatType();
        seatType1.setSeatType(seatType);
        Seat seat = new Seat();
        seat.setSeatType(seatType1);
        seat.setRowVal(rowVal);
        seat.setColVal(colVal);
        seat.setSeatName(seatName);
        seatRepository.save(seat);
        return seat;
    }
}
