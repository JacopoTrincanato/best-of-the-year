package org.lesssons.java.best_of_the_year.controllers;

import java.util.ArrayList;

import org.lesssons.java.best_of_the_year.classes.Movie;
import org.lesssons.java.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class AppControllers {

    // creo la rotta dell'applicazione
    @GetMapping("/")
    public String homepage(@RequestParam(name = "name") String name, Model model) {

        // aggiungo il parametro nome
        model.addAttribute("name", name);
        return "homepage";
    }

    // creo i metodi privati getBestMovies and getBestSongs
    private ArrayList<Movie> getBestMovies() {
        ArrayList<Movie> movies = new ArrayList<>();

        // creo alcuni film
        Movie jurassicWorld = new Movie(1, "Jurassic World");
        Movie jurassicPark = new Movie(2, "Jurassic Park");
        Movie jurassicWorldDue = new Movie(3, "Jurassic World Due");
        Movie jurassicParkDue = new Movie(4, "Jurassic Park Due");

        // aggiungo i film a movies
        movies.add(jurassicWorld);
        movies.add(jurassicPark);
        movies.add(jurassicWorldDue);
        movies.add(jurassicParkDue);

        return movies;
    }

    private ArrayList<Song> getBestSongs() {
        ArrayList<Song> songs = new ArrayList<>();

        // creo alcune canzoni
        Song blackNirvana = new Song(1, "Black Nirvana");
        Song comeUnTuono = new Song(2, "Come un Tuono");
        Song mezzoRotto = new Song(3, "Mezzo Rotto");
        Song ratata = new Song(4, "Ra Ta Ta");

        // aggiungo le canzoni a songs
        songs.add(blackNirvana);
        songs.add(comeUnTuono);
        songs.add(mezzoRotto);
        songs.add(ratata);

        return songs;
    }
}
