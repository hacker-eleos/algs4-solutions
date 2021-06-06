public class Exercise14 {
    public static int lg(int N) {
        if (!(N > 0)) throw new IllegalArgumentException("N > 0");
        int power = 1, count = 0;
        while (power <= N / 2) {
            power *= 2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 64; i++) {
            System.out.println("lg("+i+")"+":"+lg(i));
        }
    }
}
