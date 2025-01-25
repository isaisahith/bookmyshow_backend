package com.saisahith.bookmyshow.repositories;

import com.saisahith.bookmyshow.models.Region;
import com.saisahith.bookmyshow.models.Theatre;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Registered
public interface TheareRepository extends JpaRepository<Theatre, Integer> {
    List<Theatre> findByRegion(Region region);
}
