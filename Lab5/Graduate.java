package Lab5;

//Lab5 9am
//Daniel Rochefort

public class Graduate extends Student{
    private String degree;
    private String concentration;
    private int years;

    public Graduate(String degree, int years, double gpa, String major, String concentration){
        super(major, gpa);
        this.degree=degree;
        this.concentration=concentration;
        this.years=years;
    }

    public String getDegree() {
        return degree;
    }

    public int getYears(){
        return years;
    }

    public String getConcentration(){
        return concentration;
    }

    @Override
    public String toString(){
        return "Major is " + getMajor() +
                ", Concentration is " + getConcentration() +
                //", Degree is " + getDegree() + //does not ask for the degree to be printed
                ", Years in graduate school is " + getYears() + " year(s)";
    }

}
