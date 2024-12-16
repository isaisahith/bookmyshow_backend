package models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
public class Show extends BaseModel{
    private Movie movie;
    private Screen screen;
    private Date startTime;
    private List<ShowSeat> showSeats;
    private List<ShowSeatType> showSeatTypes;
}
