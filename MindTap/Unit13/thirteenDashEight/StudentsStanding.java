package MindTap.Unit13.thirteenDashEight;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.nio.channels.FileChannel;
public class StudentsStanding {
    public static void main(String[] args) {
        Path goodFile = Paths.get("C:\\Users\\droc1\\Documents\\GSU\\Sophmore Year Semester 1\\CS 1302\\src\\MindTap\\Unit13\\thirteenDashEight\\StudentsGoodStanding.txt");
        Path probFile = Paths.get("C:\\Users\\droc1\\Documents\\GSU\\Sophmore Year Semester 1\\CS 1302\\src\\MindTap\\Unit13\\thirteenDashEight\\StudentsAcademicProbation.txt");

        //Path goodFile = Paths.get("/root/sandbox/StudentsGoodStanding.txt");
        //Path probFile = Paths.get("/root/sandbox/StudentsAcademicProbation.txt");

        // Write your code here
        Scanner in = new Scanner(System.in);
        boolean cont = true;

        OutputStream goodOutput;
        OutputStream probOutput;

        try {
            goodOutput = new BufferedOutputStream(Files.newOutputStream(goodFile, CREATE));
            probOutput = new BufferedOutputStream(Files.newOutputStream(probFile, CREATE));

            while(cont){
                System.out.print("Enter the Student's ID: ");
                String id = in.nextLine().trim();
                if(id.equals("ZZZ")){
                    System.out.println("User entered ZZZ for the Student ID and ended the program.");
                    break;
                }

                System.out.print("Enter the Student's First Name: ");
                String firstName = in.nextLine().trim();

                System.out.print("Enter the Student's Last Name: ");
                String lastName = in.nextLine().trim();

                System.out.print("Enter the Student's GPA: ");
                double gpa = Double.parseDouble(in.nextLine());

                String studentInfo = "ID #" + id + " " + firstName + " " + lastName + " GPA: " + gpa + "\n";

                String studentInfoWONames = id + "," + firstName + "," + lastName + "," + gpa + "\n";
                byte[] studentInfoWONamesByte = studentInfoWONames.getBytes();

                System.out.println(studentInfo);

                if(gpa >= 2.0){
                    goodOutput.write(studentInfoWONamesByte);
                } else {
                    probOutput.write(studentInfoWONamesByte);
                }
            }

            goodOutput.flush();
            probOutput.flush();

            in.close();
            goodOutput.close();
            probOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
