package com.saisahith.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class BookingResponseDto {
    private int bookingId;
    private List<Integer> showSeatList;
    private int amount;
    private int userId;
    private ResponseStatus responseStatus;
    private String message;
}
