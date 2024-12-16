package models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Screen extends BaseModel{
    private String name;
    private Theatre theatre;
    private List<Seat> seats;
    private List<Feature> features;
}
