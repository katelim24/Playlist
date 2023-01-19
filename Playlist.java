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

        public String totalDuration(){
            double current = 0;
            String total = "";
            int mins = 0;
            int seconds = 0;
            for(int i = 0; i < playlist.size(); i++){
                current += (playlist.get(i)).getDuration();
                mins = (int)current;
                seconds = (int)(current - (int)(current)*100);
                if(seconds >= 60){
                    mins = mins + (seconds / 60);
                    seconds = seconds % 60;
                }
                total = mins + ":" + seconds;
            }
            return total;
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
