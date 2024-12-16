package models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Booking extends BaseModel{
    private User user;
    private List<ShowSeat> showSeatList;
    private Date bookedAt;
    private int amount;
    private List<Payment> payments;
    private BookingStatus bookingStatus;

}
