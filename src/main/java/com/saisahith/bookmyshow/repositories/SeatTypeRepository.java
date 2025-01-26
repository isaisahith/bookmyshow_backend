package com.saisahith.bookmyshow.repositories;

import com.saisahith.bookmyshow.models.SeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatTypeRepository extends JpaRepository<SeatType, Integer> {
}
