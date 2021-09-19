package Lab5;

//Lab5 9am
//Daniel Rochefort

public class Student{
    private String major;
    private double gpa;
    private int creditHours;

    public Student(String major, double gpa, int creditHours){
        this.major=major;
        this.gpa=gpa;
        this.creditHours=creditHours;
    }

    public Student(String major, double gpa){
        this.major=major;
        this.gpa=gpa;
    }

    public String getMajor(){
        return major;
    }

    public double getGpa(){
        return gpa;
    }

    public String getYear(){
        if(creditHours < 32) {
            return "Freshman";
        } else if(creditHours < 64){
            return "Sophomore";
        } else if(creditHours < 96){
            return "Junior";
        } else {
            return "Senior";
        }
    }


    @Override
    public String toString(){
        return "Major is " + getMajor() + ", GPA is " + getGpa() + ", Year is " + getYear();
    }
}
