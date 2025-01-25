package com.saisahith.bookmyshow.services;

import com.saisahith.bookmyshow.models.Region;
import com.saisahith.bookmyshow.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class RegionService {
    @Autowired
    public RegionRepository regionRepository;

    public Region createRegion(String name){
        Region region = new Region();
        region.setName(name);
        return regionRepository.save(region);
    }
}
