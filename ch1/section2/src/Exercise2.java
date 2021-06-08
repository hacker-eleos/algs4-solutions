import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;


public class Exercise2 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            intervals[i] = new Interval1D(x, y);
        }
        printIntersectPairs(intervals);
    }

    public static void printIntersectPairs(Interval1D[] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].intersects(intervals[j])) System.out.println(intervals[i] + "," + intervals[j]);
            }
        }
    }
}
