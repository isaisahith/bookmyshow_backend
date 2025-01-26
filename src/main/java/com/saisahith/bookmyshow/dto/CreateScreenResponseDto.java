package com.saisahith.bookmyshow.dto;

import com.saisahith.bookmyshow.models.Seat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateScreenResponseDto {
    private int screenId;
    private String screenName;
    private List<Seat> seats;
    private ResponseStatus responseStatus;
    private String message;
}
