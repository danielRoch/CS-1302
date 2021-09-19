package Lab6;

//Lab6 9am
//Daniel Rochefort

public class ColoringClient {
    public static void main(String[] args){

        ColoringPoint CP_blue = new ColoringPoint(1,3,"blue");
        ColoringPoint CP_orange = new ColoringPoint(1,2,"blue");

        System.out.println("CP_blue is " + CP_blue);
        System.out.println("CP_orange is " + CP_orange);

        System.out.println(); //Spacer println

        System.out.println("Are CP_blue and CP_orange equal: " + CP_blue.equals(CP_orange));
    }
}
