package MindTap.Unit12.twelveDashTwo;

import java.util.*;
public class TryToParseDouble {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        double numDouble = 0;
        try {
            System.out.print("Please enter a double: ");
            numDouble = Double.parseDouble(input.next());

        } catch (NumberFormatException e){
            numDouble = 0;
            System.out.println("Value entered cannot be converted to a floating-point number.");
        }
        System.out.print("Input Double: " + numDouble);
    }
}
