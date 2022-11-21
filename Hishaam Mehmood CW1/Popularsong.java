
public class Popularsong /* New class Popularsong is created. This class will be used to distinguish the main songlist from the popularsonglist.*/
{
    private String populartitle;/*This String will show the title of the popular songs.*/
    private String popularartist;/*This String will show the artist name of popular songs.*/
    private int popularplays;/*This integer is used to show the number of times a song has been played. */

    public Popularsong(String populartitle, String popularartist, int popularplays )
    {
        this.populartitle = populartitle;
        this.popularartist = popularartist;
        this.popularplays = popularplays;
    }

    public void populardisplay()
    {
        System.out.println(populartitle + " by "+ popularartist + " " + popularplays);/*When the code is run, the following output would be made on the console window; 
        *title of popular song* + *name of the artist* + *the amount of times the song has been played.**/
    }

}
