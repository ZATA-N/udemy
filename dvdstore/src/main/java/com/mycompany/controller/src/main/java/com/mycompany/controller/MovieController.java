package com.mycompany.controller;

import com.mycompany.entity.Movie;
import com.mycompany.service.MovieService;
import com.mycompany.service.MovieServiceInterface;

import java.io.IOException;
import java.util.Scanner;

public class MovieController {

    private MovieServiceInterface movieServiceInterface;

    public void addUsingConsole() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le titre du film");
        String title = scanner.nextLine();

        System.out.println("Quel est le genre du film");
        String genre = scanner.nextLine();
//  Creation d'un objet Movie et Ecriture  des attributs de l'entité Movie
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
//  Creation d'un objet MovieService et Enregistrement dans le service
        MovieService movieService = new MovieService();
        movieServiceInterface.registerMovie(movie);
    }
}
