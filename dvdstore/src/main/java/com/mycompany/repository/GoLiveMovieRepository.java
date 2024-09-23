package com.mycompany.repository;

import com.mycompany.entity.Movie;
import java.io.FileWriter;
import java.io.IOException;

public class GoLiveMovieRepository {

    public void add(Movie movie) throws IOException {
//    Instanciation de la methode FileWriter pour ecriture en fichier
        FileWriter writer;
//      Gestion des erreurs
        try {
            writer = new FileWriter("C:\\Users\\SEA ERIC MONYE\\Desktop\\dvdstore\\file dvd.txt",true);
            writer.write("Titre : "+movie.getTitle() + ",Genre :" + movie.getGenre() + "\n");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("The movie: "+movie.getTitle()+" to Genre : "+movie.getGenre()+" has been added");
    }
}
