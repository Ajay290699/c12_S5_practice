package com.niit.c12_S5_practice.repository;

import com.niit.c12_S5_practice.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
