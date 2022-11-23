public class Song /* I created a song class for our main songList ArrayList */
{
    private String title;// the String "title" is created. This will be used to display the song title. 
    private String artist;// the String "artist" is created. This will be used to display name of the song artist.
    private int plays; // an Integer is used in order to display the number of plays within the songs. An integer is used to display numerical information. 

    public Song(String title, String artist, int plays ) //when importing the Song class, the string "title", String "Artist" and integer "plays" are shown.
    {
        this.title = title; 
        this.artist = artist; 
        this.plays = plays;
    }

    public void display()
    {
        System.out.println( title + " by " + artist + " " + plays ); /*When adding the songs to the arraylist, the information is seperated by their values. 
        i.e the song title will appear as title: *Song name* artist: *artist name* plays: *number of plays*/

    }
   
    public int getPlays()
    {
        return plays;
    }
}
