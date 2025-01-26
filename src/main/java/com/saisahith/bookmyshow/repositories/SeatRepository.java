package com.saisahith.bookmyshow.repositories;

import com.saisahith.bookmyshow.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
