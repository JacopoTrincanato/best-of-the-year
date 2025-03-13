package org.lesssons.java.best_of_the_year.controllers;

import java.util.ArrayList;

import org.lesssons.java.best_of_the_year.classes.Movie;
import org.lesssons.java.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class AppControllers {

    ArrayList<Movie> movies = getBestMovies();
    ArrayList<Song> songs = getBestSongs();

    // creo la rotta dell'applicazione
    @GetMapping("/")
    public String homepage(@RequestParam(name = "name") String name, Model model) {

        // aggiungo il parametro nome
        model.addAttribute("name", name);
        return "homepage";
    }

    // creo la rotta movies
    @GetMapping("/movies")
    public String movies(Model model) {

        model.addAttribute("moviesList", movies);

        return "movies/index";
    }

    // creo la rotta movies/{id}
    @GetMapping("movies/{id}")
    public String movieById(Model model, @PathVariable("id") int urlMovieId) {

        for (Movie movie : movies) {
            if (movie.getId() == urlMovieId) {
                model.addAttribute("movieTitle", movie.getTitolo());
            }
        }
        return "movies/movieById";
    }

    // creo la rotta songs
    @GetMapping("/songs")
    public String songs(Model model) {

        model.addAttribute("songsList", songs);

        return "songs/index";
    }

    // creo la rotta songs/{id}
    @GetMapping("songs/{id}")
    public String songById(Model model, @PathVariable("id") int urlSongId) {
        for (Song song : songs) {
            if (song.getId() == urlSongId) {
                model.addAttribute("songTitle", song.getTitolo());
            }
        }

        return "songs/songById";
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
