package models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel{
    private String seat_name;
    private SeatType seatType;
    private int row;
    private int col;
}
