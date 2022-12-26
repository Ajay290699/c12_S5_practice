package com.niit.c12_S5_practice.service;

import com.niit.c12_S5_practice.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IMovieService {
    public Movie addMovie(Movie m);
    public List<Movie> getAllMovie();
}
