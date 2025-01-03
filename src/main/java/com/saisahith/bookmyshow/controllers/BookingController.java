package com.saisahith.bookmyshow.controllers;

import com.saisahith.bookmyshow.dto.BookingRequestDto;
import com.saisahith.bookmyshow.dto.BookingResponseDto;
import com.saisahith.bookmyshow.dto.ResponseStatus;
import com.saisahith.bookmyshow.models.Booking;
import com.saisahith.bookmyshow.models.ShowSeat;
import com.saisahith.bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookingController {
    @Autowired
    BookingService bookingService;

    public BookingResponseDto booking(BookingRequestDto bookingRequestDto) {
        BookingResponseDto bookingResponseDto = new BookingResponseDto();

        try{
            Booking booking = bookingService.booking(
                    bookingRequestDto.getUserId(), bookingRequestDto.getShowId(),
                    bookingRequestDto.getShowSeatIds()
            );

            bookingResponseDto.setBookingId(booking.getId());
            bookingResponseDto.setUserId(booking.getUser().getId());
            bookingResponseDto.setResponseStatus(ResponseStatus.SUCCESS);

            List<Integer> showSeats =new ArrayList<>();

            for(ShowSeat showSeat: booking.getShowSeatList()){
                showSeats.add(showSeat.getId());
            }

            bookingResponseDto.setShowSeatList(showSeats);

        }catch (Exception e){
            bookingResponseDto.setResponseStatus(ResponseStatus.FAILURE);
            bookingResponseDto.setMessage(e.getMessage());
        }

        return bookingResponseDto;
    }
}
