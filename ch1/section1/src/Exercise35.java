import edu.princeton.cs.algs4.StdRandom;

public class Exercise35 {
    private static final int SIDES = 6;

    public static double[] exactDist() {
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist[i + j] += 1.0;
            }
        }
        for (int i = 2; i <= 2 * SIDES; i++) {
            dist[i] /= 36.0;
        }
        return dist;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double[] exactDist = exactDist();
        double[] freqCumulative = new double[2 * SIDES + 1];
        for (int i = 0; i < N; i++) {
            int firstThrow = StdRandom.uniform(1, 7);
            int secondThrow = StdRandom.uniform(1, 7);
            freqCumulative[firstThrow + secondThrow]++;
        }
        for (int i = 2; i <= 2 * SIDES; i++) {
            freqCumulative[i] /= N;
        }
        for (int i = 2; i <= 2 * SIDES; i++) {
            System.out.println(Math.abs(freqCumulative[i]-exactDist[i]) < 1e-3);
        }
    }

}
