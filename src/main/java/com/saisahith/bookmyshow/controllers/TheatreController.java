package com.saisahith.bookmyshow.controllers;


import com.saisahith.bookmyshow.dto.*;
import com.saisahith.bookmyshow.dto.ResponseStatus;
import com.saisahith.bookmyshow.models.Theatre;
import com.saisahith.bookmyshow.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/theatre")
public class TheatreController {
    @Autowired
    public TheatreService theatreService;

    @PostMapping("/add")
    public CreateTheatreResponseDto craeteTheatre(@RequestBody  CreateTheatreRequestDto createTheatreRequestDto){
        CreateTheatreResponseDto createTheatreResponseDto = new CreateTheatreResponseDto();
        try {
            Theatre theatre = theatreService.createTheatre(
                    createTheatreRequestDto.getRegion_id(),
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

    @GetMapping("/get")
    public GetAllTheatresResponseDto getAllTheatres(@RequestBody GetAllTheatresRequestDto getAllTheatresRequestDto){
        GetAllTheatresResponseDto getAllTheatresResponseDto = new GetAllTheatresResponseDto();


        try{
            List<Theatre> theatres = theatreService.getAllTheatre(getAllTheatresRequestDto.getRegion_id());
            List<Pair<Integer, String>> pairs = new ArrayList<>();
            for(int i = 0; i<theatres.size(); i++){
                Pair<Integer, String> detail = Pair.of(theatres.get(i).getId(), theatres.get(i).getTheatre_name());
                pairs.add(detail);
            }
            getAllTheatresResponseDto.setTheatreDetails(pairs);
            getAllTheatresResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            getAllTheatresResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return getAllTheatresResponseDto;
    }


}
