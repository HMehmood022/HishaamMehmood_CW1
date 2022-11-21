import java.util.ArrayList;// the Arraylist class must be imported in order to use it in the application.
import java.util.Scanner;// the scanner class must be imported in order to use in the application. The scanner class allows us to recieve input the user using a scanner.

public class Playlist {
    
    private static ArrayList<Song> songList = new ArrayList<>();/*The ArrayList class is used to create lists of elements. 
    An ArrayList is a resizable array which can change its size dynamically. We used the ArrayList because it allows us to store data, also known as "elements". */
    private static ArrayList<Popularsong> PopularList = new ArrayList<>();

    public static void main(String[] args) 
    {
        int userSelected;/*An integer "Userselected" is made. The integer is used to store the option numbers. */
        add10Songs(); 
        popularSongs();


        do 
        {
            userSelected = getMenuChoice();

            switch(userSelected) //a switch is used to create selectable values. For example, if the user selects 1, they will be presented with a list of all the songs.
             {
                case 1:
                    listAllSongs();
                    break;
                case 2:
                    addSong();
                    break;
                case 3:
                    removeSong();
                    break;
                case 4:
                    listPopularSongs();
                    break;
                default:
                    break;
            }
        }
        while(userSelected > 4);/*In order to ensure the user cannot enter a value higher than the amount of options given, 
        I specified that anything more than 4 will have no return. 
        And if the user enters an option less than 1 they will recieve no return. */ 
    
    
    }

    private static void removeSong() 
    {
        Scanner sc = new Scanner(System.in); /*Here we use the scanner to receive input from the user, in this context the user is removing a song from the list. */
        String removeSong;

         System.out.println("What song would you like to remove?");
         removeSong = sc.nextLine();

         System.out.println(" Removed the song " + removeSong + " from the songlist. ");

    }

    private static void popularSongs() 
    {

        Popularsong popularSongs = new Popularsong("10: Thriller", "Micheal Jackson", 7876643);/*The strings and integar from the popularsongs java file were imported.
        As you can see below, the String Populartitle, String Popularartist and Integar popularplays are visible.
        I created a new arraylist called "Popularsongs" which will list all the elements i.e songs in order based on their number of "plays". */
        PopularList.add(popularSongs);

        popularSongs = new Popularsong("9: Angels", "Tom Walker", 7487664);
        PopularList.add(popularSongs);

        popularSongs = new Popularsong("8: Rap God", "Eminem", 6209543);
        PopularList.add(popularSongs);


        popularSongs = new Popularsong("7: Bad Guy", "Billie Eilish", 4560942);
        PopularList.add(popularSongs);


        popularSongs = new Popularsong("6: Anti-Hero", "Taylor Swift", 3599493);
        PopularList.add(popularSongs);


        popularSongs = new Popularsong("5: Lift Me Up", "Rihana", 2528892);
        PopularList.add(popularSongs);


        popularSongs = new Popularsong("4: Blood On My Jeans", "Juice WRLD", 2524431);
        PopularList.add(popularSongs);

        popularSongs = new Popularsong("3: Cuff It", "Beyonce",2351592);
        PopularList.add(popularSongs);

        popularSongs = new Popularsong("2: On and On ft Daniel Levi", "Cartoon", 2325556);
        PopularList.add(popularSongs);

        popularSongs = new Popularsong("1: Hide And Seek", "Stormzy", 2324512);
        PopularList.add(popularSongs);
    }   


    /**
     * this method will list all the songs within the songlist.
     */
    private static void listAllSongs()
    {
        System.out.println("Here is the list of current songs along with their respective plays:");
        for(Song song: songList)
        {
            song.display();
        }
    }

    public static int getMenuChoice()/*this is used to get the menu choice. */
    {
        int selection;
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to Hishaam's Songlist application!");/*When the user runs the program, they are met with the following outputs in the console window.*/
        System.out.println("------------------------------------------");
        System.out.println("Please select an option from below:");

        System.out.println("1- List all songs");/*The program presents the user with 4 options, list all songs, add song, remove song and list popular songs.*/
        System.out.println("2- Add song");
        System.out.println("3- Remove song");
        System.out.println("4- List songs by popularity");

        System.out.println("Your selected option is: "); /*The program acknowledges the user's choice and repeats it back to them.*/
        selection = sc.nextInt();
        return selection;
    }
    
    public static void addSong()
    {
        Scanner sc = new Scanner(System.in);/*Here I used the scanner class in  */
        String songAdd;

        System.out.println("What song would you like to add? ");
        songAdd = sc.nextLine();

        System.out.println("Added Song " + songAdd + " to the list. ");

    }

    public static void add10Songs()/*this method will list all songs. */
    {
        Song song = new Song("Thriller", "Micheal Jackson", 7876643);/*the Song class is imported from the Song.java file. 
        When adding songs the list, we can see the Strings and integar we created in the Song.Java file (String title, String Artist and Int plays.) An integar is used in order to display numbers.*/

        songList.add(song); //*ArrayList name*.add() is used to add the specified song to the ArrayList.

        song = new Song("Rap God", "Eminem", 6209543);

        songList.add(song);

        song = new Song("Angels", "Tom Walker", 7487664);

        songList.add(song);

        song = new Song("Bad Guy", "Billie Eilish", 4560942);

        songList.add(song);

        song = new Song("Anti-Hero", "Taylor Swift", 3599493);

        songList.add(song);

        song = new Song("Lift Me Up", "Rihana", 2528892);

        songList.add(song);

        song = new Song("Cuff It", "Beyonce", 2351592);

        songList.add(song);

        song = new Song("On and On ft Daniel Levi", "Cartoon", 2325556);

        songList.add(song);

        song = new Song("Blood On My Jeans", "Juice WRLD", 2524431);

        songList.add(song);

        song = new Song("Hide And Seek", "Stormzy", 2324512);

        songList.add(song);
    }

    public static void listPopularSongs()//This method will be used to display the popular songs.
    {
        System.out.println("Here is a popularity list of the songs, based on the amount of plays.");

        for(Popularsong popularSongs: PopularList)
        {
            popularSongs.populardisplay();/*This will display the Popularsongs arraylist which we created at the top, all the songs are sorted via their number of plays. */
        }
    }

        
} 
