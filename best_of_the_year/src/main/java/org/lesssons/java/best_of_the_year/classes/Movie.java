package org.lesssons.java.best_of_the_year.classes;

public class Movie {
    // attributi
    private int id;
    private String titolo;

    // costruttore
    public Movie(int id, String titolo) {
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

    @Override
    public String toString() {
        return String.format("%i, %s", id, titolo);
    }
}
