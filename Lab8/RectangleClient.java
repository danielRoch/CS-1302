package Lab8;
//Lab8 9am
//Daniel Rochefort

import java.util.*;
public class RectangleClient {

    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,2);
        Point p3 = new Point(1,3);
        Point p4 = new Point(1,4);
        Point p5 = new Point(1,5);
        Point p6 = new Point(1,6);
        Point p7 = new Point(1,7);
        Point p8 = new Point(1,8);
        Point p9 = new Point(1,9);
        Point p10 = new Point(1,10);

        Rectangle r1 = new Rectangle(1,1,p10);
        Rectangle r2 = new Rectangle(1,2,p2);
        Rectangle r3 = new Rectangle(1,3,p3);
        Rectangle r4 = new Rectangle(1,4,p4);
        Rectangle r5 = new Rectangle(1,5,p5);
        Rectangle r6 = new Rectangle(1,6,p6);
        Rectangle r7 = new Rectangle(1,7,p7);
        Rectangle r8 = new Rectangle(1,8,p8);
        Rectangle r9 = new Rectangle(1,9,p9);
        Rectangle r10 = new Rectangle(1,1,p1);


        ArrayList<Rectangle> list1 = new ArrayList<Rectangle>(Arrays.asList(r1,r2,r3,r4,r5,r6,r7,r8,r9,r10));

        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }

        Collections.sort(list1);
        System.out.println("\nAfter Sort");
        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }

    }
}
