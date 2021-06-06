import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise23 {

    public static void main(String[] args) {
        int[] whitelist = (new In(args[0])).readAllInts();
        Arrays.sort(whitelist);
        boolean inWhiteList = args[1].equals("+");
        boolean notInWhiteList = args[1].equals("-");
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int rank = BinarySearch.rank(key, whitelist);
            if (inWhiteList && rank == -1) {
                StdOut.println(key);
            } else if (notInWhiteList && rank != -1) {
                System.out.println(key);
            }
        }

    }
}
