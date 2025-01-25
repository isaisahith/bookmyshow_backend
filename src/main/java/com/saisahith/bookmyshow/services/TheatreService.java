package com.saisahith.bookmyshow.services;


import com.saisahith.bookmyshow.models.Feature;
import com.saisahith.bookmyshow.models.Region;
import com.saisahith.bookmyshow.models.Theatre;
import com.saisahith.bookmyshow.repositories.RegionRepository;
import com.saisahith.bookmyshow.repositories.TheareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    @Autowired
    public TheareRepository theatreRepository;
    @Autowired
    public RegionRepository regionRepository;

    public Theatre createTheatre(
            String region,
            String name,
            String address

    ) {

        Region regionObj = new Region();
        regionObj.setName(region);
        regionRepository.save(regionObj);
        Theatre theatreObj = new Theatre();
        theatreObj.setAddress(address);
        theatreObj.setRegion(regionObj);
        theatreObj.setTheatre_name(name);
        theatreRepository.save(theatreObj);
        return  theatreObj;
    }

}
