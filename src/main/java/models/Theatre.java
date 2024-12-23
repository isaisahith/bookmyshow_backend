package models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Theatre extends BaseModel{
    private String theatre_name;
    private String address;
//    @OneToMany
//    private List<Screen> screens;
//    @ManyToMany
//    private List<Movie> movies;
    @ManyToOne
    private Region region;
}
