import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        Arrays.sort(a);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            Counter counter = new Counter("keys examined");
            totalKeysExamined(key, a, counter);
            StdOut.println(counter.tally());
        }
    }

    public static void totalKeysExamined(int key, int[] a, Counter counter) {
        totalKeysExamined(key, a, counter, 0, a.length - 1);
    }

    private static void totalKeysExamined(int key, int[] a, Counter counter, int lo, int hi) {
        if (lo > hi) return;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            counter.increment();
            totalKeysExamined(key, a, counter, lo, mid - 1);
        }
        else if (key > a[mid]) {
            counter.increment();
            totalKeysExamined(key, a, counter, mid + 1, hi);
        }
        counter.increment();
    }
}
