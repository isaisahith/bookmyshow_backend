package com.saisahith.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity(name = "users")
@Getter
@Setter
public class User extends BaseModel{
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    @OneToMany
    private List<Booking> bookings;
}
