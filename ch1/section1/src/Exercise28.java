import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class Exercise28 {

    public static int removeDuplicates(int[] a) {
        int index = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[index - 1] != a[i]) a[index++] = a[i];
        }
        return index;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whiteList = in.readAllInts();
        Arrays.sort(whiteList);
        int index = removeDuplicates(whiteList);
        System.out.println(Arrays.toString(Arrays.copyOf(whiteList, index)));
    }
}
