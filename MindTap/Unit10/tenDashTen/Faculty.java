package MindTap.Unit10.tenDashTen;

import java.util.*;
public class Faculty extends CollegeEmployee
{
    private boolean isTenured = false;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            // write your code here
            super.setData();
            System.out.println("If you are tenured please enter true, if you are not tenured please enter false: ");
            isTenured = input.nextBoolean();

        }
    @Override
        public void display()
        {
            // write your code here
            super.display();
            if(isTenured) {
                System.out.println("Faculty member is tenured");
            } else {
                System.out.println("Faculty member is not tenured");
            }
        }
}
