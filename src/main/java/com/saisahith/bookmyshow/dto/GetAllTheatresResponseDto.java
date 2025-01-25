package com.saisahith.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.util.Pair;

import java.util.List;

@Getter
@Setter
public class GetAllTheatresResponseDto {
    private List<Pair<Integer, String>> theatreDetails;
    private ResponseStatus responseStatus;
}
