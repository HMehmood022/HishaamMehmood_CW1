import java.util.ArrayList;// the Arraylist class must be imported in order to use it in the application.
import java.util.Scanner;// the scanner class must be imported in order to use in the application. The scanner class allows us to recieve input the user using a scanner.

public class Playlist {
    
    private static ArrayList<Song> songList = new ArrayList<>();/*The ArrayList class is used to create lists of elements. 
    An ArrayList is a resizable array which can change its size dynamically. We used the ArrayList because it allows us to store data, also known as "elements". */

    private static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) 
    {
        int userSelected;/*An integer "Userselected" is made. The integer is used to store the option numbers. */
        add10Songs(); 


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
                    printPopularSongs();
                    break;
                default:
                    break;
            }
        }
        while(userSelected < 5);/*In order to ensure the user cannot enter a value higher than the amount of options given, 
        I specified that anything more than 4 will have no return. 
        And if the user enters an option less than 1 they will recieve no return. */ 
    
    
    }

    private static void removeSong() 
    {
        /*make song list */
         System.out.println("What song number would you like to remove?");
         int removeSong = sc.nextInt();
        
         songList.remove(removeSong-1);

         System.out.println("Removed song " + removeSong + " from the songlist. ");

    }

    private static void printPopularSongs() 
    {
        System.out.println("Please enter the number of plays");
        int plays = sc.nextInt();

        for(Song song: songList)
        {
           if(song.getPlays() > plays) song.display();
        }
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
        String songTitle;

        System.out.println("What song title would you like to add? ");
        songTitle = sc.nextLine();

        System.out.println("Please enter song artist: ");
        String artist = sc.nextLine();
        System.out.println("Please enter the number of plays: ");
        int plays = sc.nextInt();

        System.out.println("Your chosen song has been added to the list. Please enter the number 1 to view it in the songlist.");
            Song song = new Song( " 11. " + songTitle, artist, plays );

        songList.add(song);


    }

    public static void add10Songs()/*this method will list all songs. */
    {
        Song song = new Song(" 1. Thriller ", " Micheal Jackson ", 7876643);/*the Song class is imported from the Song.java file. 
        When adding songs the list, we can see the Strings and integar we created in the Song.Java file (String title, String Artist and Int plays.) An integar is used in order to display numbers.*/

        songList.add(song); //*ArrayList name*.add() is used to add the specified song to the ArrayList.

        song = new Song(" 2. Rap God ", " Eminem ", 620954);

        songList.add(song);

        song = new Song(" 3. Angels ", " Tom Walker ", 748766);

        songList.add(song);

        song = new Song(" 4. Bad Guy ", " Billie Eilish ", 456094);

        songList.add(song);

        song = new Song(" 5. Anti-Hero ", " Taylor Swift ", 359949);

        songList.add(song);

        song = new Song(" 6. Lift Me Up ", " Rihana ", 25288);

        songList.add(song);

        song = new Song(" 7. Cuff It ", " Beyonce ", 235159);

        songList.add(song);

        song = new Song(" 8. On and On ft Daniel Levi ", " Cartoon ", 232555);

        songList.add(song);

        song = new Song(" 9. Blood On My Jeans ", " Juice WRLD ", 252443);

        songList.add(song);

        song = new Song(" 10. Hide And Seek ", " Stormzy ", 232451);

        songList.add(song);
    }
} 
