package MindTap.Unit13.thirteenDashThree;

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileSizeComparison {
    public static void main(String[] args) {
        Path textFile = Paths.get("C:\\Users\\droc1\\Documents\\GSU\\Sophmore Year Semester 1\\CS 1302\\src\\MindTap\\Unit13\\thirteenDashThree\\lyric1.txt");
        Path wordFile = Paths.get("C:\\Users\\droc1\\Documents\\GSU\\Sophmore Year Semester 1\\CS 1302\\src\\MindTap\\Unit13\\thirteenDashThree\\lyric2.txt");
        // Write your code here
        try {
            BasicFileAttributes textFileAttributes = Files.readAttributes(textFile,BasicFileAttributes.class);
            long textFileSize = textFileAttributes.size();
            System.out.println("The size of Lyric1 is: " + textFileSize);

            BasicFileAttributes wordFileAttributes = Files.readAttributes(wordFile,BasicFileAttributes.class);
            long wordFileSize = wordFileAttributes.size();
            System.out.println("\nThe size of Lyric2 is: " + wordFileSize);

            Double textToWord = (wordFileSize * 100.0 / textFileSize);
            Double wordToText = (textFileSize * 100.0 / wordFileSize);

            if(textFileAttributes.size() > wordFileAttributes.size()){
                System.out.println("\nThe ratio of the size of Lyric1 to Lyric2 is Lyric2 is: " + wordFileSize + "/" + textFileSize + " " + textToWord + "% of Lyric1.");
            } else {
                System.out.println("\nThe ratio of the size of Lyric1 to Lyric2 is Lyric1 is: " + textFileSize + "/" + wordFileSize +  " " + wordToText + "% of Lyric2.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
