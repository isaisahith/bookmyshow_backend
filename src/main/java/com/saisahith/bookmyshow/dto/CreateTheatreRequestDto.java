package com.saisahith.bookmyshow.dto;


import com.saisahith.bookmyshow.models.Feature;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateTheatreRequestDto {
    private int region_id;
    private String address;
    private String name;

}
