package com.mycompany.service;

import com.mycompany.entity.Movie;
import com.mycompany.repository.MovieRepository;

import java.io.IOException;

public class MovieService implements MovieServiceInterface {

    private MovieRepository movieRepository;

    @Override
    public void resisterMovie(Movie movie) {

        movieRepository.add(movie);

    }
}
