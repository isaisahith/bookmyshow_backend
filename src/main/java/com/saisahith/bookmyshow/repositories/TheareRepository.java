package com.saisahith.bookmyshow.repositories;

import com.saisahith.bookmyshow.models.Theatre;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface TheareRepository extends JpaRepository<Theatre, Integer> {
}
