package Lab5;

//Lab5 9am
//Daniel Rochefort

public class StudentClient {
    public static void main(String[] args){
        Undergraduate Alex = new Undergraduate("CS",3.9,54,true);

        Graduate Mary = new Graduate("Master",1,3.91,"Computer Science","Data Science");

        System.out.println("Alex:");
        System.out.println(Alex);

        System.out.println("");//Seperation

        System.out.println("Mary:");
        System.out.println(Mary);

        System.out.println("");//Seperation

        Exchange YingShu = new Exchange(3.98,"Computer Science","Tiawan","Fall 2020");

        System.out.println("YingShu:");
        System.out.println(YingShu);


    }
}
