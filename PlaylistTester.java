/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //initialize a new playlist
        Playlist a = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */

        Song s = new Song("Luck Be A Lady", "Frank Sinatra", 5.14, true);
        a.addSong(s);
        a.addSong(new Song("The Girl From Impanema", "Frank Sinatra", 3.14, true));
        a.addSong(new Song("Kill Bill", "SZA", 2.33, true));
        a.addSong(new Song("Star Man", "David Bowie", 4.13, true));
        a.addSong(new Song("Can't Take My Eyes Off of You", "Lauren Hill", 3.40, true));



        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        System.out.println(a.toString());


        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        System.out.println("Liking song at position 1...");
        a.likeSong(1);


        System.out.println("Printing the songs...\n");
        System.out.println(a.toString());

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        System.out.println("Removing song at position 1");
        a.removeSong(1);
        System.out.println("Removing song at position 2");
        a.removeSong(1);



        System.out.println("Printing the songs...\n");
        System.out.println(a.toString());

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        System.out.println(a.likedSongs());

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(a.totalDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        System.out.println(a.toString());
    }
}
