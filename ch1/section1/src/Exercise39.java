import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Exercise39 {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int[] NN = {1000, 10000, 100000, 1000000};
        for (int i = 0; i < NN.length; i++) {
            int N = NN[i];
            int runningSum = 0;
            for (int j = 0; j < T; j++) {
                int count = 0;
                StdRandom.setSeed(System.nanoTime());
                int[] a = new int[N];
                int[] b = new int[N];
                for (int k = 0; k < N; k++) {
                    a[k] = StdRandom.uniform(100000, 1000000);
                    b[k] = StdRandom.uniform(100000, 1000000);
                }
                Arrays.sort(a);
                Arrays.sort(b);
                for (int k = 100000; k < 1000000; k++) {
                    if (BinarySearch.rank(k, a) != -1 && BinarySearch.rank(k, b) != -1) count++;
                }
                runningSum += count;
            }
            System.out.printf("N: %d, T: %d, Matches: %d\n", N, T, runningSum / T);
        }
    }
}
