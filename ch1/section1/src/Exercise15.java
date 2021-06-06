import edu.princeton.cs.algs4.BinarySearch;

import java.util.Arrays;

public class Exercise15 {
    public static int[] histogram(int[] a, int M) {
        Arrays.sort(a);
        int[] histogram = new int[M];
        for (int i = 0; i < M; i++) {
            int rank = BinarySearch.indexOf(a, i);
            if (rank == -1)
                histogram[i] = 0;
            else
                histogram[i] = count(i, a);
        }
        return histogram;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 2, 3, 1, 1, 3, 4, 7, 4, 1, 1, 5, 7,};
        System.out.println(Arrays.toString(histogram(a, 5)));
    }

    public static int count(int key, int[] a) {
        return count(key, a, 0, a.length - 1);
    }

    private static int count(int key, int[] a, int lo, int hi) {
        if (lo > hi) return 0;
        int mid = lo + (hi - lo) / 2;
        if (key == a[mid]) return 1 + count(key, a, lo, mid - 1) + count(key, a, mid + 1, hi);
        else if (key > a[mid]) return count(key, a, mid + 1, hi);
        else return count(key, a, lo, mid - 1);
    }
}
