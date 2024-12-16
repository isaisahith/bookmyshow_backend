package models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Movie extends BaseModel{
    private String title;
    private int duration;
    private List<String> actors;
    private List<Language> languages;
    private String genre;
    private String director;
    private String year;
}
