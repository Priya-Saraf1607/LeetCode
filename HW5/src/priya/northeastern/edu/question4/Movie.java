package priya.northeastern.edu.question4;

import java.util.Date;
import java.util.List;

//Movie class has Title of movie, Release date, List of actors, Director
public class Movie {
    String Title;
    Date ReleaseDate;
    List<String> actors;
    String Director;

    public Movie(String title, Date releaseDate, List<String> actors, String director) {
        Title = title;
        ReleaseDate = releaseDate;
        this.actors = actors;
        Director = director;
    }
}
