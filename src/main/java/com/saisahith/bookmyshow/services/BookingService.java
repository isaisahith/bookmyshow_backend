package com.saisahith.bookmyshow.services;

import com.saisahith.bookmyshow.models.*;
import com.saisahith.bookmyshow.repositories.BookingRepository;
import com.saisahith.bookmyshow.repositories.ShowRepository;
import com.saisahith.bookmyshow.repositories.ShowSeatRepository;
import com.saisahith.bookmyshow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    ShowRepository showRepository;
    @Autowired
    ShowSeatRepository showSeatRepository;
    public Booking booking(int userId, int showId, List<Integer> showSeatIds){

        Optional<User> user = userRepository.findById(userId);

        if(!user.isPresent()){
            throw new RuntimeException("User not found");
        }

        Optional<Show> show = showRepository.findById(showId);

        if(!show.isPresent()){
            throw new RuntimeException("Show not found");
        }

        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);

        for(ShowSeat showSeat : showSeats){
            if(showSeat.getShowSeatStatus().equals(ShowSeatStatus.BLOCKED)){
                throw new RuntimeException("Show seat not available");
            }
        }

        for(ShowSeat showSeat : showSeats){
            showSeat.setShowSeatStatus(ShowSeatStatus.BLOCKED);
            showSeatRepository.save(showSeat);
        }

        Booking booking = new Booking();

        booking.setUser(user.get());
        booking.setBookingStatus(BookingStatus.PENDING);
        booking.setShowSeatList(showSeats);

        bookingRepository.save(booking);


        return booking;

    }
}
