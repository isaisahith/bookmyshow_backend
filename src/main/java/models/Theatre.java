package models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Theatre extends BaseModel{
    private String theatre_name;
    private String address;
    private List<Screen> screens;
    private List<Movie> movies;
    private Region region;
}
