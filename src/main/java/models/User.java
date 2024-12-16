package models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User extends BaseModel{
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private List<Booking> bookings;
}
