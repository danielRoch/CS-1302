package MindTap.Unit9;
import java.util.*;
public class RecordingSort {
    public static void main(String[] args) {
        // Write your code here

        Scanner in = new Scanner(System.in);

        Recording[] records = new Recording[5];

        for(int i=0; i<records.length; i++){
            records[i]=new Recording();

            System.out.print("Enter song by artist#" + i +": ");
            String song = in.nextLine();
            records[i].setSong(song);

            System.out.print("Enter name of artist#" + i +": ");
            String name = in.nextLine();
            records[i].setArtist(name);

            System.out.print("Enter the length in seconds for " + song + " by " + name + ": ");
            int timeSeconds = Integer.parseInt(in.nextLine());
            records[i].setPlayTime(timeSeconds);
        }

        System.out.print("How would you like to sort the records by (S)ong title, (A)rtist, or playing (T)ime: ");
        String sortBy = in.nextLine().toUpperCase();

        boolean con = true;
        while(con) {
            switch (sortBy) {
                case "S":
                    con = false;
                    sortBySong(records);
                    break;
                case "A":
                    con = false;
                    sortByArtist(records);
                    break;

                case "T":
                    con = false;
                    sortByTime(records);
                    break;
                default:
                    System.out.println("Error " + sortBy + " is not a valid input. To sort by Song title please type \"S\", to sort by artist please type \"A\", to sort by time type \"T\"");
                    break;
            }
        }

        in.close();

        for(int i =0; i<records.length; i++){
            System.out.println("The song: " + records[i].getSong() + " by: " + records[i].getArtist() + " has a song time of: " +
                    records[i].getPlayTime() + " seconds.");
        }
    }

    public static void sortByArtist(Recording[] array) {
        // Write your code here
        Arrays.sort(array, (a,b) -> a.getArtist().compareTo(b.getArtist()));
    }

    public static void sortBySong(Recording[] array) {
        // Write your code here
        Arrays.sort(array, (a,b) -> a.getSong().compareTo(b.getSong()));
    }

    public static void sortByTime(Recording[] array) {
        // Write your code here
        Arrays.sort(array, (a,b) -> a.getPlayTime() - b.getPlayTime());
    }
}
