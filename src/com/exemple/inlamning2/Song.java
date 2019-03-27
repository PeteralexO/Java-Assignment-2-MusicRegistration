package com.exemple.inlamning2;

/**
 * <h1>Superklass för låtarana</h1>
 * @author  Alexander Olsson
 */
public class Song {
    private String name;
    private String genre;

    public Song()
        {

    }

    /**
     * Konstruktor
     * @param name
     * @param genre
     */
    public Song(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    /**
     * Get metod för låtens Namn
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Get metod för låtens Genre
     * @return
     */
    public String getGenre() {
        return genre;
    }

}
