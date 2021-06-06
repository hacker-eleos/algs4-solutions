import edu.princeton.cs.algs4.StdOut;

public class Exercise19 {
    private static final long[] fibs = new long[100];

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        fibs[0] = 0L;
        fibs[1] = 1L;
        if (fibs[N - 1] == 0) {
            for (int i = 2; i < N; i++) {
                fibs[i] = fibs[i - 1] + fibs[i - 2];
            }
            return fibs[N - 1] + fibs[N - 2];
        }
        return fibs[N - 1] + fibs[N - 2];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 50; N++) {
            StdOut.println(N + " " + F(N));
        }
    }
}