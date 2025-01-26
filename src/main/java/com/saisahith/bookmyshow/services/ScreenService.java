package com.saisahith.bookmyshow.services;

import com.saisahith.bookmyshow.models.*;
import com.saisahith.bookmyshow.repositories.ScreenRepository;
import com.saisahith.bookmyshow.repositories.SeatRepository;
import com.saisahith.bookmyshow.repositories.SeatTypeRepository;
import com.saisahith.bookmyshow.repositories.TheareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ScreenService {
    @Autowired
    public TheareRepository theareRepository;
    @Autowired
    public SeatRepository seatRepository;
    @Autowired
    public SeatTypeRepository seatTypeRepository;
    @Autowired
    private ScreenRepository screenRepository;


    public Screen createScreen(
            int theatreId,
            String screenName,
            int noOfSeats,
            List<Integer> features) throws Exception {
        System.out.println(theatreId);
        Optional<Theatre> theatreOp = theareRepository.findById(theatreId);


        if(theatreOp.isEmpty()){
            throw new Exception("Theatre not found");
        }

        Screen screen = new Screen();
        screen.setTheatre(theatreOp.get());
        screen.setName(screenName);

        List<Feature> feature = new ArrayList<>();

        for(int i=0; i<features.size(); i++){
            if(features.get(i) == 0){
                feature.add(Feature.THREE_D);
            }else if(features.get(i) == 1){
                feature.add(Feature.FOUR_K);
            }else if(features.get(i) == 2){
                feature.add(Feature.DOLBY);
            }else{
                throw new Exception("Invalid feature");
            }
        }

        int row=1;
        int col=1;
        int seatType_id = 2;
        List<Seat> seats = new ArrayList<>();
        for(int i=0; i<noOfSeats; i++){
            String seatName = String.valueOf((char)('A' + row - 1)) + col;
            Seat seat = new Seat();
            seat.setSeatName(seatName);
            seat.setColVal(col);
            seat.setRowVal(row);
            Optional<SeatType> seatTypeOp = seatTypeRepository.findById(seatType_id);
            if(seatTypeOp.isEmpty()){
                throw new Exception("Seat type not found");
            }

            seat.setSeatType(seatTypeOp.get());
            seats.add(seat);
            seatRepository.save(seat);

            col++;

            if(col==11){
                col=1;
                row++;
            }
        }
        screen.setSeats(seats);


        return screenRepository.save(screen);
    }
}
