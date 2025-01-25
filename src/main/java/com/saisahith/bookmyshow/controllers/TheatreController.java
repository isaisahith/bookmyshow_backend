package com.saisahith.bookmyshow.controllers;


import com.saisahith.bookmyshow.dto.CreateTheatreRequestDto;
import com.saisahith.bookmyshow.dto.CreateTheatreResponseDto;
import com.saisahith.bookmyshow.dto.ResponseStatus;
import com.saisahith.bookmyshow.models.Theatre;
import com.saisahith.bookmyshow.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TheatreController {
    @Autowired
    public TheatreService theatreService;
    public CreateTheatreResponseDto craeteTheatre(CreateTheatreRequestDto createTheatreRequestDto){
        CreateTheatreResponseDto createTheatreResponseDto = new CreateTheatreResponseDto();
        try {
            Theatre theatre = theatreService.createTheatre(
                    createTheatreRequestDto.getRegion(),
                    createTheatreRequestDto.getName(),
                    createTheatreRequestDto.getAddress());
            createTheatreResponseDto.setTheatreId(theatre.getId());
            createTheatreResponseDto.setTheatreName(theatre.getTheatre_name());
            createTheatreResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
            createTheatreResponseDto.setMessage("Successfully created theatre");
        }catch (Exception e){
            createTheatreResponseDto.setResponseStatus(ResponseStatus.FAILURE);
            createTheatreResponseDto.setMessage(e.getMessage());
        }

        return createTheatreResponseDto;


    }
}
