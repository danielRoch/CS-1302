package MindTap.Unit13.thirteenDashEight;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class StudentsStanding2 {
    public static void main(String[] args) {
        Path goodFile = Paths.get("C:\\Users\\droc1\\Documents\\GSU\\Sophmore Year Semester 1\\CS 1302\\src\\MindTap\\Unit13\\thirteenDashEight\\StudentsGoodStanding.txt");
        Path probFile = Paths.get("C:\\Users\\droc1\\Documents\\GSU\\Sophmore Year Semester 1\\CS 1302\\src\\MindTap\\Unit13\\thirteenDashEight\\StudentsAcademicProbation.txt");

        //Path goodFile = Paths.get("/root/sandbox/StudentsGoodStanding.txt");
        //Path probFile = Paths.get("/root/sandbox/StudentsAcademicProbation.txt");

        // Write your code here
        InputStream goodInput = null;
        InputStream probInput = null;

        try {
            goodInput = Files.newInputStream(goodFile);
            probInput = Files.newInputStream(probFile);
            BufferedReader goodReader = new BufferedReader(new InputStreamReader(goodInput));
            BufferedReader probReader = new BufferedReader(new InputStreamReader(probInput));

            System.out.println("Probationary Standing");

            String probLine = probReader.readLine();
            while(probLine != null){
                display(probLine);
                probLine = probReader.readLine();
            }

            System.out.println("Good Standing");

            String goodLine = goodReader.readLine();
            while(goodLine != null){
                display(goodLine);
                goodLine = goodReader.readLine();
            }

            goodReader.close();
            probReader.close();

            goodInput.close();
            probInput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public static void display(String s) {
        // Write your code here
        try {
            String id = s.substring(0, s.indexOf(','));
            s = s.substring(s.indexOf(',') + 1);

            String firstName = s.substring(0, s.indexOf(','));
            s = s.substring(s.indexOf(',') + 1);

            String lastName = s.substring(0, s.indexOf(','));
            s = s.substring(s.indexOf(',') + 1);

            double gpa = Double.parseDouble(s);
            double fromCutOff = gpa - 2.0;

            System.out.println("ID# " + id + " " + firstName + " " + lastName + " GPA: " +
                    gpa + " " + fromCutOff + " from 2.0 cutoff");
        } catch(Exception e){
            System.out.print("");
        }
    }
}
