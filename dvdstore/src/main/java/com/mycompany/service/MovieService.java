package com.mycompany.service;

import com.mycompany.entity.Movie;
import com.mycompany.repository.GoLiveMovieRepository;
import com.mycompany.repository.MovieRepository;

import java.io.IOException;

public class MovieService {

    private MovieRepository movieRepository = new MovieRepository();
    private GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();

    public void registerMovie(Movie movie){

      movieRepository.add(movie);
    }

    public void registerMovie2(Movie movie) throws IOException {
        goLiveMovieRepository.add(movie);
    }
}
