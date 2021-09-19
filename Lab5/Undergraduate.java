package Lab5;

//Lab5 9am
//Daniel Rochefort

public class Undergraduate extends Student{
    private boolean honors;

    public Undergraduate(String major, double gpa, int creditHours, boolean honors){
        super(major, gpa, creditHours);
        this.honors=honors;
    }

    public Undergraduate(String major, double gpa){
        super(major, gpa);
    }

    public boolean isHonors(){
        return honors;
    }

    @Override
    public String toString(){
        return super.toString() + ", Honors is " + isHonors();
    }
}
