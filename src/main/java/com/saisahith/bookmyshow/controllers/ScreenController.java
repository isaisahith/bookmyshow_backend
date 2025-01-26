package com.saisahith.bookmyshow.controllers;

import com.saisahith.bookmyshow.dto.CreateScreenRequestDto;
import com.saisahith.bookmyshow.dto.CreateScreenResponseDto;
import com.saisahith.bookmyshow.dto.ResponseStatus;
import com.saisahith.bookmyshow.models.Screen;
import com.saisahith.bookmyshow.services.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/screen")
public class ScreenController {

    @Autowired
    public ScreenService screenService;

    @PostMapping("/add")
    public CreateScreenResponseDto createScreen(@RequestBody  CreateScreenRequestDto createScreenRequestDto) {
        CreateScreenResponseDto createScreenResponseDto = new CreateScreenResponseDto();
        System.out.println(createScreenRequestDto.getTheaterId());
        try{
            Screen screen = screenService.createScreen(
                    createScreenRequestDto.getTheaterId(),
                    createScreenRequestDto.getName(),
                    createScreenRequestDto.getNoOfSeats(),
                    createScreenRequestDto.getFeatures()
            );

            createScreenResponseDto.setScreenId(screen.getId());
            createScreenResponseDto.setScreenName(screen.getName());
            createScreenResponseDto.setSeats(screen.getSeats());
            createScreenResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
            createScreenResponseDto.setMessage("Screen created successfully.");

        }catch (Exception e){
            createScreenResponseDto.setResponseStatus(ResponseStatus.FAILURE);
            createScreenResponseDto.setMessage(e.getMessage());

        }
        return createScreenResponseDto;
    }
}
