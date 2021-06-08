import edu.princeton.cs.algs4.StdOut;

public class Exercise11 {
    // test client for SmartDate
    public static void main(String[] args) {
        try {
            SmartDate smartDate = new SmartDate(2, 29, 2021);
        } catch (IllegalArgumentException exception) {
            exception.printStackTrace();
            StdOut.println(exception.getLocalizedMessage());
        }
    }
}
