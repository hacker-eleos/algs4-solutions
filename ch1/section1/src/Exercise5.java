public class Exercise5 {
    public static void check(double x, double y){
        boolean isValid = ( x > 0) && (x < 1) && (y > 0) && (y < 1);
        System.out.println(isValid);
    }

    public static void main(String[] args) {
        check(0.2, 0.3);
    }
}
