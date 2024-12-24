package com.saisahith.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Screen extends BaseModel{
    private String name;
    @ManyToOne
    private Theatre theatre;
    @OneToMany
    private List<Seat> seats;
    @Enumerated(value = EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}
