package models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Movie extends BaseModel{
    private String title;
    private int duration;
    //@ElementCollection
    //private List<String> actors;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Language> languages;
    private String genre;
    private String director;
    private String year;
}
