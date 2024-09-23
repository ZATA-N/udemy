package com.mycompany;

import com.mycompany.controller.MovieController;
import com.mycompany.entity.Movie;
import com.mycompany.service.MovieService;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Quel est le titre du film");
//        String title = scanner.nextLine();
//
//        System.out.println("Quel est le genre du film");
//        String genre = scanner.nextLine();
////  Creation d'un objet Movie et Ecriture  des attributs de l'entité Movie
//        Movie movie = new Movie();
//        movie.setTitle(title);
//        movie.setGenre(genre);
////  Creation d'un objet MovieService et Enregistrement dans le service
//        MovieService movieService = new MovieService();
//        movieService.registerMovie(movie);

// Enregistrement avec le controller

        MovieController movieController = new MovieController();
        movieController.addUsingConsole();

    }
}