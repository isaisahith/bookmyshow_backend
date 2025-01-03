package com.saisahith.bookmyshow.dto;

import java.util.List;

public class BookingResponseDto {
    private int bookingId;
    private List<Integer> showSeatList;
    private int amount;
    private int userId;
    private ResponseStatus responseStatus;
}
