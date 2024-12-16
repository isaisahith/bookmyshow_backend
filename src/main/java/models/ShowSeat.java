package models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel{
    private Seat seat;
    private Show show;
    private ShowSeatType showSeatType;
    private ShowSeatStatus showSeatStatus;
}
