import edu.princeton.cs.algs4.*;

public class Exercise3 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        Interval2D[] intervals = new Interval2D[N];
        Interval1D[] horizontalIntervals = new Interval1D[N];
        Interval1D[] verticalIntervals = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            Interval1D horizontalInterval = generateInterval1D(min, max);
            Interval1D verticalInterval = generateInterval1D(min, max);
            intervals[i] = new Interval2D(horizontalInterval, verticalInterval);
            horizontalIntervals[i] = horizontalInterval;
            verticalIntervals[i] = verticalInterval;
        }
        StdDraw.setCanvasSize(1024, 512);
        StdDraw.setYscale(min - .1, max + .1);
        StdDraw.setXscale(min - .1, max + .1);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.square(0.5, 0.5, 0.5);
        StdDraw.setPenColor();
        for (int i = 0; i < N; i++) intervals[i].draw();

        Counter counter = new Counter("intersection pairs");
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (intervals[i].intersects(intervals[j])) counter.increment();
            }
        }
        System.out.println(counter.tally());

        counter = new Counter("contains pairs");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j != i && contains(horizontalIntervals[i], verticalIntervals[i], horizontalIntervals[j], verticalIntervals[j]))
                    counter.increment();
            }
        }
        System.out.println(counter.tally());
    }

    /**
     * Generate interval whose width is uniformly distributed between min and max in the unit square.
     *
     * @param min min value of height/width
     * @param max max value of height/width
     * @return
     */
    private static Interval1D generateInterval1D(double min, double max) {
        double x = StdRandom.uniform(min, max);
        double y = StdRandom.uniform(min, max);
        x = (x - min) / (max - min);
        y = (y - min) / (max - min);
        return new Interval1D(Math.min(x, y), Math.max(x, y));
    }

    /**
     * Does the first rectangle defined by the first pair of arguments contains inside the second rectangle
     * defined by the second pair of arguments?
     *
     * @param h1 Horizontal interval of first rectangle
     * @param v1 Vertical interval of second rectangle
     * @param h2 Horizontal interval of first rectangle
     * @param v2 Vertical interval of second rectangle
     * @return true if first rectangle contains inside the second rectangle, otherwise false
     */
    private static boolean contains(Interval1D h1, Interval1D v1, Interval1D h2, Interval1D v2) {
        return h2.max() > h1.max() && h2.min() < h1.min() && v2.max() > v1.max() && v2.min() < v1.min();
    }

}
