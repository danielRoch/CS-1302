package MindTap.Unit10.tenDashTen;

import java.util.*;
public class Person
{
    private String firstName;
    private String lastName;
    private String address;
    private String zip;
    private String phone;
    Scanner input = new Scanner(System.in);
    public void setData()
    {
        // write your code here
        System.out.println("Please enter your first name: ");
        firstName = input.nextLine();

        System.out.println("Please enter your last name: ");
        lastName = input.nextLine();

        System.out.println("Please enter your address: ");
        address = input.nextLine();

        System.out.println("Please enter your zip code: ");
        zip = input.nextLine();

        System.out.println("Please enter your phone number: ");
        phone = input.nextLine();
    }
    public void display()
    {
        // write your code here
        System.out.println(firstName + " " + lastName + " " + address + " " + zip + " " + phone);
    }
}
