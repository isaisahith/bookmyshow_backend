package com.saisahith.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateScreenRequestDto {
    private int theaterId;
    private String name;
    private int noOfSeats;
    private List<Integer> features;
}
