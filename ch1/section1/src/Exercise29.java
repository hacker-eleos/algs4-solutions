import java.util.Arrays;

public class Exercise29 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int count(int key, int[] a) {
        return count(key, a, 0, a.length - 1);
    }

    private static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return lo;
        int mid = lo + (hi - lo) / 2;
        if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else return rank(key, a, lo, mid - 1);
    }

    private static int count(int key, int[] a, int lo, int hi) {
        if (lo > hi) return 0;
        int mid = lo + (hi - lo) / 2;
        if (key == a[mid]) return 1 + count(key, a, lo, mid - 1) + count(key, a, mid + 1, hi);
        else if (key < a[mid]) return count(key, a, lo, mid - 1);
        else return count(key, a, mid + 1, hi);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 2, 3, 4, 4, 4, 6, 6};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("rank: " + rank(4, a));
        System.out.println("count: " + count(7, a));
    }
}
