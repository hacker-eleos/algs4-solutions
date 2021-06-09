public class Exercise16 {
    public static void main(String[] args) {
        Rational rational = new Rational(-4, 6);
        try {
            new Rational(-1, 0);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(rational);
        System.out.println(rational.plus(new Rational(1, -2)));
        System.out.println(rational.minus(new Rational(1, 2)));
        System.out.println(rational.times(new Rational(2 , 5)));
        System.out.println(rational.dividedBy(new Rational(-2 ,3)));
    }
}
