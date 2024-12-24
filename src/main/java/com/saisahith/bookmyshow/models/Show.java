package com.saisahith.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity(name = "movie_show")
@Getter
@Setter
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Screen screen;
    private Date startTime;
    @OneToMany
    private List<ShowSeat> showSeats;
    @OneToMany
    private List<ShowSeatType> showSeatTypes;
}
