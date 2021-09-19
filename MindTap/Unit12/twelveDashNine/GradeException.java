package MindTap.Unit12.twelveDashNine;

public class GradeException extends Exception {
    public GradeException(String string) {
        super(string);
    }

    public static char[] validGrades = {'A','B','C','D','F','I'};
}