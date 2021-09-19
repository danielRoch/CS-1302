package MindTap.Unit10.tenDashTen;

import java.util.*;
public class Student extends Person
{
    private String major;
    private double gpa;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            // write your code here
            super.setData();
            System.out.println("Please enter your Major: ");
            major = input.nextLine();

            System.out.println("Please enter in your GPA: ");
            gpa = input.nextDouble();
        }
    @Override
        public void display()
        {
            // write your code here
            super.display();
            System.out.println("Major: " + major + "  GPA: " + gpa);
        }
}
