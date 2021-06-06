public class Exercise27 {
    public static double binomial1(int N, int k, double p) {
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomial1(N - 1, k, p) + p * binomial1(N - 1, k - 1, p);
    }

    public static double bionmial2(int N, int k, double p) {
        double[][] b = new double[N + 1][k + 1];
        b[0][0] = 1.0;
        for (int i = 1; i < N + 1; i++) {
            b[i][0] = Math.pow(1.0 - p, i);
        }
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                b[i][j] = ((1.0 - p) * b[i - 1][j]) + (p * b[i - 1][j - 1]);
            }
        }
        return b[N][k];
    }


    public static void main(String[] args) {
        System.out.println(bionmial2(100, 2, .5));
    }
}
