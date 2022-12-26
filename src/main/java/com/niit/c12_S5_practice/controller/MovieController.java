package com.niit.c12_S5_practice.controller;

import com.niit.c12_S5_practice.domain.Movie;
import com.niit.c12_S5_practice.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class MovieController {

    IMovieService iMovieService;
    @Autowired
    public MovieController(IMovieService iMovieService){
        this.iMovieService = iMovieService;
    }

    @PostMapping("/movie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie){
        Movie movie1 = iMovieService.addMovie(movie);
        return new ResponseEntity<>(movie1, HttpStatus.CREATED);
    }

    @GetMapping("/movies")
    public ResponseEntity<?> getAllMovie(){
        List<Movie> list = iMovieService.getAllMovie();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
