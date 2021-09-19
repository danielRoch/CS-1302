package MindTap.Unit10.tenDashTen;

import java.util.*;
public class CollegeEmployee extends Person
{   
    private String ssn;
    private double annualSalary;
    private String dept;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            // write your code here
            super.setData();
            System.out.println("Please enter your Social Security Number: ");
            ssn = input.nextLine();

            System.out.println("Please enter your annual salary: ");
            annualSalary = Double.parseDouble(input.nextLine());

            System.out.println("Please enter your department: ");
            dept = input.nextLine();

        }
    @Override
        public void display()
        {
            // write your code here
            super.display();
            System.out.println("SSN: " + ssn + " Salary $" + annualSalary + " Department: " + dept);

        }
}
