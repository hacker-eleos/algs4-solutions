import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class Exercise38 {
    public static int binarySearch(int key, int[] a) {
        return binarySearch(key, a, 0, a.length - 1);
    }

    private static int binarySearch(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return binarySearch(key, a, lo, mid - 1);
        else if (key > a[mid]) return binarySearch(key, a, mid + 1, hi);
        else return mid;
    }

    public static int bruteForceSearch(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whiteListBruteForce = in.readAllInts();
        in.close();
        int N = whiteListBruteForce.length;
        int[] whiteListBinarySearch = Arrays.copyOf(whiteListBruteForce, whiteListBruteForce.length);
        Arrays.sort(whiteListBinarySearch);
        double bruteForceAverage = 0.0;
        double binarySearchAverage = 0.0;
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            double startTime = System.nanoTime();
            bruteForceSearch(key, whiteListBruteForce);
            double elapsedTime = System.nanoTime() - startTime;
            bruteForceAverage += elapsedTime;
            startTime = System.nanoTime();
            binarySearch(key, whiteListBinarySearch);
            elapsedTime = System.nanoTime() - startTime;
            binarySearchAverage += elapsedTime;
        }
        System.out.printf("%.4f, %.4f", bruteForceAverage/N, binarySearchAverage/N);
    }
}
