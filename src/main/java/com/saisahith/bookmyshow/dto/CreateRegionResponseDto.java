package com.saisahith.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateRegionResponseDto {
    private int regionId;
    private String regionName;
    private ResponseStatus responseStatus;
}
