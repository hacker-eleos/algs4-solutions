import edu.princeton.cs.algs4.StdRandom;

public class Exercise37 {
    public static void customShuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // Exchange a[i] with random element in a[i..N-1]
            int r = StdRandom.uniform(N);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
    public static void ShuffleTest(int M, int N) {
        int[][] result = new int[M][M];
        for (int i = 0; i < N; i++) {
            int[] a = new int[M];
            for (int j = 0; j < M; j++) {
                a[j] = j;
            }
            customShuffle(a);
            for (int j = 0; j < M; j++) {
                result[a[j]][j] += 1;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                stringBuilder.append(result[i][j]).append(" ");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
        System.out.printf("%d", N / M);
    }

    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        ShuffleTest(M , N);
    }
}
