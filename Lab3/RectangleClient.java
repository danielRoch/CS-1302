package Lab3;

//Lab3 9am
//Daniel Rochefort
//"S" = Space

public class RectangleClient {
    public static void main(String[] args){

        Rectangle rect1 = new Rectangle();
        rect1.setFields(5,3,2,3);
        System.out.println(rect1);

        for(int i = 1; i < rect1.getY(); i++){
                System.out.println("S");
        }
        for(int j = 0; j < rect1.getHeight(); j++){
            for(int h = 0; h < rect1.getX(); h++){
                System.out.print("S");
            }
            for(int rWidth = 0; rWidth < rect1.getWidth(); rWidth++){
                System.out.print("R");
            }
            System.out.println("");
        }


        Rectangle rect2 = new Rectangle();
        rect2.setFields(1,2,5,4);
        System.out.println(rect2);

        for(int i = 1; i < rect2.getY(); i++){
            System.out.println("S");
        }
        for(int j = 0; j < rect2.getHeight(); j++){
            for(int h = 0; h < rect2.getX(); h++){
                System.out.print("S");
            }
            for(int rWidth = 0; rWidth < rect2.getWidth(); rWidth++){
                System.out.print("R");
            }
            System.out.println("");
        }
    }
}

/*
x=1
y=2
width=5
height=4
S
SRRRRR
SRRRRR
SRRRRR
SRRRRR
 */