public class Exercise24 {
    public static int euclid(int p, int q) {
        System.out.printf("p = %d, q = %d\n", p, q);
        if (q == 0) return p;
        return euclid(q, p % q);
    }

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        euclid(p, q);
    }
}
