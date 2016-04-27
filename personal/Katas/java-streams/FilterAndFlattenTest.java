package com.yammer.dojo.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;


public class FilterAndFlattenTest {

    @Test
    public void testFilterOutBadMovies(){
        List<Movie> movies = createListOfMovies();
        /*
        Objective:  Filter out movies that have a rating less than 3.0.
                    Map to a list of movie title as Strings.
         */
        List<String> goodMovieNames = null;

        Assert.assertEquals(Arrays.asList("Die Hard", "Bad Boys"), goodMovieNames);
    }

    @Test
    public void testFlattenListofListOfMovies() {
        List<List<Movie>> listOfListOfMovies = Arrays.asList(
                createListOfMovies(),
                createAnotherList()
        );

        /*
         Objective: Flatten List of List of movies, convert list of movies to a map object of id's and title
         Hint: Look into Collectors.toMap
         */
        Map<Integer, String> movieTitles = null;

        Assert.assertEquals(expectedMapOfMovies(), movieTitles);
    }

    private Map<Integer, String> expectedMapOfMovies() {
        Map<Integer, String> movieMap = new TreeMap<>();

        movieMap.put(1010101, "The Graduate");
        movieMap.put(108221, "Pitch Perfect");
        movieMap.put(70111470, "Die Hard");
        movieMap.put(654356453, "Bad Boys");
        movieMap.put(65432445, "Pixel");
        movieMap.put(675465, "The fantastic four");
        movieMap.put(8273411, "Taken 3");

        return movieMap;
    }


    private List<Movie> createAnotherList() {
        return Arrays.asList(
                new Movie(1010101, "http://anicepicture.png", "The Graduate", 5.0),
                new Movie(108221, "http://anicepicture22.png", "Pitch Perfect", 3.5)
        );
    }
    private List<Movie> createListOfMovies() {
        Movie m1 = new Movie(70111470, "http://cdn-0.nflximg.com/images/2891/DieHard.jpg", "Die Hard", 4.0);
        Movie m2 = new Movie(654356453, "http://cdn-0.nflximg.com/images/2891/BadBoys.jpg", "Bad Boys", 5.0);
        Movie m3 = new Movie(65432445, "http://cdn-0.nflximg.com/images/2891/Pixel.jpg", "Pixel", 2.0);
        Movie m4 = new Movie(675465, "http://cdn-0.nflximg.com/images/2891/FantasticFour.jpg", "The fantastic four", 1.5);
        Movie m5 = new Movie(8273411, "http://cdn-0.nflximg.com/images/2891/Taken3.jpg", "Taken 3", 1.0);

        return Arrays.asList(m1,m2,m3,m4,m5);
    }

    class Movie {
        String boxart;
        Integer id;
        String title;
        Double rating;

        public Movie(Integer id, String boxart, String title, Double rating) {
            this.id = id;
            this.boxart = boxart;
            this.title = title;
            this.rating = rating;
        }

        public Integer getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }
    }
}
