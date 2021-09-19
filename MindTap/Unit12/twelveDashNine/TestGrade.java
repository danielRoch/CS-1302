package MindTap.Unit12.twelveDashNine;

import java.util.*;
public class TestGrade {
    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] ids = {1234, 1245, 1267, 1278, 2345,
                     1256, 3456, 3478, 4567, 5678
                    };
        char[] grades = new char[10];
        String gradeString = new String();
        final int HIGHLIMIT = 100;
        String inString, outString = "";
        int flag = 0;
        for (int x = 0; x < ids.length; ++x) {
            System.out.println("Enter letter grade for student id number: " + ids[x]);
                inString = input.next().toUpperCase();
                grades[x] = inString.charAt(0);
                // Write your code here
//            try {
//                if (grades[x] == 'A' || grades[x] == 'B' || grades[x] == 'C' || grades[x] == 'D' || grades[x] == 'F' || grades[x] == 'I') {
//                } else {
//                    grades[x] = 'I';
//                    throw (new GradeException(Character.toString(grades[x])));
//                }
//            }catch (GradeException e){
//                System.out.println("Invalid Grade");
//            }
            try {
                int valid = 0;
                for(int i = 0; i < GradeException.validGrades.length; i++){
                    if(grades[x] == GradeException.validGrades[i]){
                        valid = valid+1;
                    }
                }
                if(valid != 1) {
                    grades[x] = 'I';
                    throw (new GradeException(Character.toString(grades[x])));
                }
            }catch (GradeException e){
                System.out.println("Invalid Grade");
            }

        }
        for (int x = 0; x < ids.length; ++x)
            outString = outString + "ID #" + ids[x] + "  Grade " +
                        grades[x] + "\n";
        System.out.println(outString);
    }
}
