package priya.northeastern.edu.question4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws ParseException {
        Date twoThousand = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date nineteenHundred = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Movie movie1 = new Movie("Spiderman", new GregorianCalendar(2021, Calendar.DECEMBER, 15).getTime(),
                Arrays.asList("Tom Holland", "Zendaya"), "Tom");
        Movie movie2 = new Movie("Star Wars: Episode I - The Phantom Menace", new GregorianCalendar(1999, Calendar.AUGUST, 03).getTime(),
                Arrays.asList("Natalie Portman", "Keira Knightley"), "Jon Watts");
        Movie movie3 = new Movie("Four Weddings and a Funeral", new GregorianCalendar(1994, Calendar.DECEMBER, 01).getTime(),
                Arrays.asList("Hugh Grant", "Kristin Scott Thomas"), "Jon Watts");
        Movie movie4 = new Movie("Enchanted", new GregorianCalendar(2004, Calendar.JUNE, 24).getTime(),
                Arrays.asList("Amny Adams", "Patrick"), "Jon Watts");

        //Add List of movies based on the classes created above.
        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);

        List<Movie> cryList = new ArrayList<>();
        cryList.add(movie3);
        cryList.add(movie4);

        Genre funny = new Genre(movieList);
        Genre tragic = new Genre(cryList);

        List<Genre> genreList = new ArrayList<>();
        genreList.add(funny);
        genreList.add(tragic);

        Netflix netflix = new Netflix(genreList);

        netflix.list.stream()
                .flatMap(genre -> genre.list.stream())
                .filter(movie -> movie.ReleaseDate.before(twoThousand))
                .forEach(movie -> movie.Title = movie.Title + "(Classic)");


        List<Movie> ans = netflix.list.stream().flatMap(genre -> genre.list.stream()).sorted(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.ReleaseDate.compareTo(o1.ReleaseDate);
            }
        }).limit(3).collect(Collectors.toList());

        List<Movie> listOfAllMovie = netflix.list.stream().flatMap(genre -> genre.list.stream()).collect(Collectors.toList());
        Predicate<Movie> dateBefore2000 = movie -> movie.ReleaseDate.before(twoThousand);
        Predicate<Movie> dateAfter1990 = movie -> movie.ReleaseDate.after(nineteenHundred);
        printMovieInRange((ArrayList<Movie>) listOfAllMovie, dateBefore2000, dateAfter1990);


        for(Movie movie : listOfAllMovie) addReleaseYear(movie);


        Collections.sort(listOfAllMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.Title.compareTo(o2.Title);
            }
        });
    }

    private static void printMovieInRange(ArrayList<Movie> res, Predicate<Movie> condition1, Predicate<Movie> condition2){
        for (Movie movie: res) {
            if(condition1.test(movie) && condition2.test(movie)){
                System.out.println(movie.Title);
            }
        }
    }

    private static void addReleaseYear(Movie movie) {
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy");
        String year = dayFormat.format(movie.ReleaseDate);
        movie.Title = movie.Title + year;
    }
}
