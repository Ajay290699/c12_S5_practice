package com.niit.c12_S5_practice.service;

import com.niit.c12_S5_practice.domain.Movie;
import com.niit.c12_S5_practice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService {

    MovieRepository movieRepository;
    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie addMovie(Movie m){
        return movieRepository.save(m);
    }

    @Override
    public List<Movie> getAllMovie(){
        return (List<Movie>) movieRepository.findAll();
    }
}
