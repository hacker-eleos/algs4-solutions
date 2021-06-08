import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Exercise1 {
    private static Point2D[] px;
    private static Point2D[] py;

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(-1.0, 1.0);
            double y = StdRandom.uniform(-1.0, 1.0);
            points[i] = new Point2D(x, y);
        }
        System.out.println(closestPairDistanceBruteForce(points));
    }

    private static void preProcess(Point2D[] points) {
        //  Implement divide and conquer algorithm from algorithms specialization
        int N = points.length;
        px = Arrays.copyOf(points, N);
        py = Arrays.copyOf(points, N);
        Arrays.sort(px, Point2D.X_ORDER);
        Arrays.sort(py, Point2D.Y_ORDER);
    }

    public static double closestPairDistance(Point2D[] points) {
        if (points.length <= 3) return closestPairDistanceBruteForce(points);
        preProcess(points);
        return closestPairDistanceAux(px, py);
    }

    private static double closestPairDistanceAux(Point2D[] px, Point2D[] py) {
        int N = px.length;
        if (N <= 3) return closestPairDistanceBruteForce(px);
        int mid = N / 2;
        Point2D[] lx = Arrays.copyOfRange(px, 0, mid);
        Point2D[] rx = Arrays.copyOfRange(px, mid, N);
        Point2D[] ly = new Point2D[lx.length];
        Point2D[] ry = new Point2D[ly.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < N; i++) {
            if (py[i].x() <= px[mid].x()) ly[j++] = new Point2D(py[i].x(), py[i].y());
            else ry[k++] = new Point2D(py[i].x(), py[i].y());
        }
        double leftDistance = closestPairDistanceAux(lx, ly);
        double rightDistance = closestPairDistanceAux(rx, ry);
        return 0;
    }

    private static double closestSplitPair(Point2D[] px, Point2D[] py){
        return 0;
    }

    private static double closestPairDistanceBruteForce(Point2D[] points) {
        if (points.length < 2) throw new IllegalArgumentException("insufficient points");
        double minDistance = Double.POSITIVE_INFINITY;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                double distance = points[i].distanceTo(points[j]);
                if (minDistance > distance) minDistance = distance;
            }
        }
        return minDistance;
    }

    private class Pair {
        private final Point2D x;
        private final Point2D y;

        public Pair(Point2D a, Point2D b) {
            x = new Point2D(a.x(), a.y());
            y = new Point2D(b.x(), b.y());
        }
    }
}
