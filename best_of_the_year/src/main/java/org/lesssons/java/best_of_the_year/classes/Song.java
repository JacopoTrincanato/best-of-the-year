package org.lesssons.java.best_of_the_year.classes;

public class Song {
    // attributi
    private int id;
    private String titolo;

    // costruttore
    public Song(int id, String titolo) {
        this.id = id;
        this.titolo = titolo;
    }

    // metodi
    public int getId() {
        return this.id;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
