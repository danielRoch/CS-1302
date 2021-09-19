package Lab5;

//Lab5 9am
//Daniel Rochefort

public class Exchange extends Undergraduate{
    private String country;
    private String year;

    public Exchange(double gpa, String major, String country, String year){
        super(major, gpa);
        this.country=country;
        this.year=year;
    }

    public String getYear(){
        return year;
    }
    public String getCountry(){
        return country;
    }

    @Override
    public String toString(){
        return "GPA is " + getGpa() +
                ", Major is " + getMajor() +
                //", Exchange year is " + getYear() + //Doesn't say to print out the year they exchanged
                ", From the country of " + getCountry();
    }
}
