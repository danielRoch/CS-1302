package MindTap.Unit12.twelveDashSix;

public class ThrowCourseException {
    public static void main(String[] args) {
        // Write your code here
        try {
            Course[] courses = new Course[6];
            courses[0] = new Course("CIS", 101, 3);
            courses[1] = new Course("ENG", 131, 0.5);
            courses[2] = new Course("SI", 100, 4.5);
            courses[3] = new Course("MTH", 400, 6);
            courses[4] = new Course("ENGR", 399, 5);
            courses[5] = new Course("PYC", 500, 7);

            for(int i = 0; i < courses.length; i++){
                System.out.println(courses[i]);
            }
        } catch (CourseException e){
            System.out.println(e.getMessage());
        }
    }
}
