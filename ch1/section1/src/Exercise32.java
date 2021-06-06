import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import java.util.Arrays;
import java.util.Collections;

public class Exercise32 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int l = Integer.parseInt(args[1]);
        int r = Integer.parseInt(args[2]);
        Integer[] counts = new Integer[N];
        for (int i = 0; i < N; i++) {
            counts[i] = 0;
        }
        double binWidth = (double) (r - l) / (double) N;
        while (!StdIn.isEmpty()) {
            double d = StdIn.readDouble();
            if ((d <= (double) l) || (d >= (double) r)) continue;
            int bin = (int) ((d - (double) l) / binWidth);
            counts[bin] += 1;
        }

        StdDraw.setYscale(0, Collections.max(Arrays.asList(counts))+1);
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = counts[i] / 2.0;
            double rw = 0.5 / N;
            double rh = counts[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
