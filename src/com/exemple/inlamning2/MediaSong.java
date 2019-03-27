package com.exemple.inlamning2;

/**
 * <h1> Sub klass för låtarna</h1>
 * Här tar vi från superklassen och lägger in mer variabler.
 * Vi skapar också alla objekt här.
 * @author  Alexander Olsson
 */
public class MediaSong extends Song {
    private String format;

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    private Integer rating;

    /**
     * get metod för låtens format
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * Get metod för låtens rating
     * @return
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * Konstruktor
     * @param title
     * @param genre
     * @param format
     * @param rating
     */
    public MediaSong(String title, String genre, String format, Integer rating) {
        super (title, genre);
        this.format = format;
        this.rating = rating;
    }

    /**
     * Metoden som skapar ett objekt
     * @param name
     * @param genre
     * @param format
     * @param rating
     * @return
     */
    public static MediaSong createSong(String name, String genre, String format, Integer rating) {
        return new MediaSong(name, genre, format, rating);

    }



}
