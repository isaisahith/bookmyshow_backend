package com.saisahith.bookmyshow.repositories;

import com.saisahith.bookmyshow.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegionRepository extends JpaRepository<Region, Integer> {
    Optional<Region> findById(int regionId);
}
