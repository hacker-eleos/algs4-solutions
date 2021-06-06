import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise22 {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        String trace = String.format("rank(%d, a, %d, %d)", key, lo, hi);
        String format = "%" + (depth + trace.length()) + "s\n";
        StdOut.printf(format, trace);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            int r = rank(key, a, lo, mid - 1, depth + 1);
            StdOut.printf(format, trace);
            return r;
        } else if (key > a[mid]) {
            int r = rank(key, a, mid + 1, hi, depth + 1);
            StdOut.printf(format, trace);
            return r;
        } else {
            StdOut.printf(format, trace);
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] whitelist = (new In(args[0])).readAllInts();
        Arrays.sort(whitelist);
//        System.out.println(Arrays.toString(whitelist));
        int r = Exercise22.rank(13, whitelist);
        if (r == -1) System.out.println("Key not found");
        else System.out.println(r);
    }
}
