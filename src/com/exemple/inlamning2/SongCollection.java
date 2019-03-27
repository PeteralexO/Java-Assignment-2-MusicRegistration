package com.exemple.inlamning2;

import java.util.ArrayList;

/**
 * <h1> Funktiner och Arraylista</h1>
 * Här är alla funktiner samlade och här är det vi skapar en arraylista
 * @author  Alexander Olsson
 */
public class SongCollection {


    private  ArrayList<MediaSong> list;

    public SongCollection() {
        this.list = new ArrayList<MediaSong>();
    }


    public ArrayList<MediaSong> getList() {
        return list;
    }

    /**
     * Lägger till låt i arraylist
     * @param mediaSong
     * @return returnerar true om låten har lagts till
     */
    public boolean addSong(MediaSong mediaSong) {

        list.add(mediaSong);
        return true;

    }

    /**
     * Skriver ut låtar genom en loop
     */
    public void printSongs() {
        System.out.println("Songlista: \n");
        for (int i = 0; i < list.size(); i++) {
            System.out.print( "Song: " + (i + 1) + ". " +
                 "Namn: " +  list.get(i).getName() + " -> " +
                    "Genre: " +  list.get(i).getGenre() + " -> " +
                  "Format: " +  list.get (i).getFormat() );
            if (list.get(i).getRating()>0){
           System.out.print(" -> " + "Rating: " + list.get (i).getRating()+ " \n");}
           else {System.out.println("\n");}
        }
    }

    /**
     * Finner låten användaren har matat in
     * @param song
     * @return
     */
    private int findSong(MediaSong song) {
        return list.indexOf(song);
    }

    /**
     * Finner låten användaren har matat in
     * @param songName
     * @return
     */
    private int findSong(String songName) {
        for(int i=0; i<this.list.size(); i++) {
            MediaSong song = this.list.get(i);
            if(song.getName().equals(songName)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Uppdaterar en existerande låt med ny info
     * @param oldSong
     * @param newSong
     * @return Retunerar True om låten har uppdateras
     */
   /* public boolean updateSong(MediaSong oldSong, MediaSong newSong) {
        int foundPosition = findSong(oldSong);
        if(foundPosition <0) {
            System.out.println(oldSong.getName() +", gick inte att hitta.");
            return false;
        }

        this.list.set(foundPosition, newSong);
        System.out.println(oldSong.getName() + ", har ändras till = " + newSong.getName());
        return true;
    }*/

    /**
     * Letar upp vilken position i arraylistan den låten man vill uppdaterar är
     * @param name
     * @return
     */
    public MediaSong querySong(String name) {
        int position = findSong(name);
        if(position >=0) {
            return this.list.get(position);
        }

        return null;
    }
}
