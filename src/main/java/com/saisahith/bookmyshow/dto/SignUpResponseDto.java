package com.saisahith.bookmyshow.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SignUpResponseDto {
    private String userId;
    private String message;
    private ResponseStatus status;
}
