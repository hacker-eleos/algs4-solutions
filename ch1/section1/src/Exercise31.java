import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Exercise31 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        plot(N, p);
    }

    public static void plot(int N, double p) {
        StdDraw.setXscale(-1.2, 1.2);
        StdDraw.setYscale(-1.2, 1.2);
        StdDraw.setPenRadius(.05);
        double interval = Math.PI * 2 / N;
        for (int i = 0; i < N; i++) {
            double theta = interval * i;
            double x = Math.sin(theta);
            double y = Math.cos(theta);
            StdDraw.point(x, y);
        }
        StdDraw.setPenRadius();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (Math.random() < p) {
                    double theta = interval * i;
                    double x1 = Math.sin(theta);
                    double y1 = Math.cos(theta);
                    theta = Math.PI + theta;
                    double x2 = Math.sin(theta);
                    double y2 = Math.cos(theta);
                    StdDraw.line(x1, y1, x2, y2);
                }
            }
        }


    }
}
