import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */

    private ArrayList<Song> playlist;
    private String liked;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
      public Playlist(){
        playlist = new ArrayList<Song>();
      }


      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

        public void addSong(Song a){
            playlist.add(a);
        }

        public void likeSong(Song a){
            a.changeStatus();
        }

        public void removeSong(int position){
            playlist.remove(position);
        }

        public String toString(){
            String s = "";
            for (Song a: playlist){
                s+= a.toString();
            }
            return s;
        }

        public String likedSongs(){
            String liked = "";
            for(int i = 0; i < playlist.size(); i++){
                if(playlist.get(i).getStatus() == true){
                    liked += playlist.get(i);
                }
            }
            return liked;
        }

        public double totalDuration(){
            double count = 0;
            for(int i = 0; i < playlist.size(); i++){
                (playlist.get(i)).getDuration();
            }
            return count;
        }

        public ArrayList<Song> removeUnliked(){
            for(int i = 0; i < playlist.size(); i++){
                if((playlist.get(i)).getStatus() == true){
                    playlist.remove(i);
                }
            }
            return playlist;
        }
}
