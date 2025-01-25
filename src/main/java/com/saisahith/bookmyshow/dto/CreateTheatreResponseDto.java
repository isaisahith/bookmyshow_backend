package com.saisahith.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTheatreResponseDto {
    private int theatreId;
    private String theatreName;
    private ResponseStatus responseStatus;
    private String message;
}
