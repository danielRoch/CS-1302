package MindTap.Unit12.twelveDashSix;

public class Course {
    String department;
    int courseNumber;
    double credits;
    final int DEPT_LENGTH = 3;
    final int LOW_NUM = 100;
    final int HIGH_NUM = 499;
    final double LOW_CREDITS = 0.5;
    final double HIGH_CREDITS = 6;
    public Course() {
        // Write your code here

    }

    public Course(String dept, int num, double creditValue) throws CourseException {
        // Write your code here
        department = dept;
        courseNumber = num;
        credits = creditValue;

        if(department.length() != DEPT_LENGTH || (courseNumber > HIGH_NUM || courseNumber < LOW_NUM) || (credits > HIGH_CREDITS || credits < LOW_CREDITS)){
            throw(new CourseException("There is an error in your Course with either: Department: " + department + ", Course Number: " + courseNumber + ", or Credit Value: " + credits));
        }
    }
    public String toString() {
        // Write your code here
        return "Department: " + department + ", Course Number: " + courseNumber + ", Credit Value: " + credits;
    }
}