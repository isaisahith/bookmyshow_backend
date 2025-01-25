package com.saisahith.bookmyshow.controllers;

import com.saisahith.bookmyshow.dto.CreateRegionRequestDto;
import com.saisahith.bookmyshow.dto.CreateRegionResponseDto;
import com.saisahith.bookmyshow.dto.CreateTheatreResponseDto;
import com.saisahith.bookmyshow.dto.ResponseStatus;
import com.saisahith.bookmyshow.models.Region;
import com.saisahith.bookmyshow.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/region")
public class RegionController {
    @Autowired
    public RegionService regionService;



    @PostMapping("/add")
    public CreateRegionResponseDto createRegion(@RequestBody CreateRegionRequestDto createRegionRequestDto) {
        CreateRegionResponseDto createRegionResponseDto = new CreateRegionResponseDto();
        try{
            Region region = regionService.createRegion(createRegionRequestDto.getName());
            createRegionResponseDto.setRegionId(region.getId());
            createRegionResponseDto.setRegionName(region.getName());
            createRegionResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            createRegionResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return createRegionResponseDto;
    }
}
