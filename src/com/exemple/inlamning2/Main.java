package com.exemple.inlamning2;


import java.util.Scanner;

/**
 * <h1>Sång Registrering Program</h1>
 * Detta är ett program som användaren kan lägga in låtar en arraylista som sparas som obejkt med olika variablar
 * I programmet kan användaren också visa inlagda låtar, uppdatera låtarna och sätta en rating på befintliga låtar.
 * @author  Alexander Olsson
 *
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static SongCollection songCollection = new SongCollection();

    private static MediaSong media = new MediaSong("låtitel", "rock", "mp3", 0
    );


    public static void main(String[] args) {
        System.out.println("Hej och välkommen till vår låtsläpparsida \n \n Vad vill du göra? ");
        boolean running = true;
        mainmeny();
        while (running) {


            int choice = scanner.nextInt();
            switch (choice) {
                case 0: running =false;
                break;
                case 1:
                    addSong();
                    break;
                case 2:
                    songCollection.printSongs();
                    break;
                case 3:
                    updateSong();
                    break;
                case 4: mainmeny();
                break;



            }
            System.out.println("\nVisa Meny: 4");

        }
    }

    /**
     * Skriver ut Användar meny
     */
    private static void mainmeny() {
        System.out.println("  0- Stäng av \n "
                + " 1- Lägg till låt \n "
                + " 2- Visa inlagda låtar \n "
                + " 3- Sätt en rating och uppdatera låten \n "
                + " 4- Visa meny \n "


        );

    }

    /**
     * Lägger till låt
     */
    private static void addSong() {
        scanner.nextLine();
        System.out.println("Vad ska låten heta? ");
        String name = scanner.nextLine();
        System.out.println("Vilken genre har låten ?");
        String genre = scanner.nextLine();
        System.out.println("Vilken format skas låten ha?");
        String format = scanner.nextLine();
        MediaSong newSong = MediaSong.createSong(name, genre, format,0);
        if (songCollection.addSong(newSong)) {
            System.out.println("Din inlagda låts namn: " + name + ", Genre: " + genre + ", Format: " + format);

        }

    }

    /**
     * Hittar låt
     */
    private static void querySong() {
        System.out.println("Skriv in namnet på Sången: ");
        String name = scanner.nextLine();
        MediaSong existingSong = songCollection.querySong(name);
        if (existingSong == null) {
            System.out.println("Kan inte hitta Song.");
            return;
        }

        System.out.println("Namn: " + existingSong.getName() + " genre är " + existingSong.getGenre());
    }

    /**
     * Uppdaterar låt och sätter Rating
     */
    private static void updateSong() {
        scanner.nextLine();
        System.out.println("Skriv in namnet på sången som skall få en rating och uppdateras: ");
        String name = scanner.nextLine();
        MediaSong existingSong = songCollection.querySong(name);
        if(existingSong == null) {
            System.out.println("Kan inte hitta låten.");
            return;
        }
        System.out.print("Vilken rating vill du ge låten? : ");
        Integer newRating = scanner.nextInt();
        existingSong.setRating(newRating);

    }




}
