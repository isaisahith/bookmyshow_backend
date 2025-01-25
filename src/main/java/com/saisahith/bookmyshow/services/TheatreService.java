package com.saisahith.bookmyshow.services;


import com.saisahith.bookmyshow.models.Feature;
import com.saisahith.bookmyshow.models.Region;
import com.saisahith.bookmyshow.models.Theatre;
import com.saisahith.bookmyshow.repositories.RegionRepository;
import com.saisahith.bookmyshow.repositories.TheareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TheatreService {

    @Autowired
    public TheareRepository theatreRepository;
    @Autowired
    public RegionRepository regionRepository;

    public Theatre createTheatre(
            int region_id,
            String name,
            String address

    ) throws Exception {

        Optional<Region> region = regionRepository.findById(region_id);




        if (region.isEmpty()) {
            throw new Exception("Region not found");
        }


        Region regionObj = region.get();

        Theatre theatreObj = new Theatre();
        theatreObj.setAddress(address);
        theatreObj.setRegion(regionObj);
        theatreObj.setTheatre_name(name);
        theatreRepository.save(theatreObj);

        return  theatreObj;
    }

    public List<Theatre> getAllTheatre(int region_id) throws Exception {
        Optional<Region> region = regionRepository.findById(region_id);
        if (region.isEmpty()) {
            throw new Exception("Region not found");
        }
        List<Theatre> theatres = new ArrayList<>();
        theatres = theatreRepository.findByRegion(region.get());
        return theatres;
    }

}
