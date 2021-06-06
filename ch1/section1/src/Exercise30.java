import java.util.Arrays;

public class Exercise30 {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static boolean[][] relativelyPrime(int N) {
        boolean[][] array = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = gcd(i, j) == 1;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println(Arrays.deepToString(relativelyPrime(N)));
    }
}
