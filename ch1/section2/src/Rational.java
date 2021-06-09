import java.util.Objects;

public class Rational {
    private final long numerator;
    private final long denominator;

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("denominator is zero");
        if (denominator < 0) {
            long gcd = gcd(-numerator, -denominator);
            this.numerator = -numerator / gcd;
            this.denominator = -denominator / gcd;
        } else {
            long gcd = gcd(numerator, denominator);
            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;
        }
    }


    private Rational(long numerator, long denominator) {
        if (denominator == 0L) throw new IllegalArgumentException("denominator is zero");
        long gcd = gcd(numerator, denominator);
        if (denominator < 0L) {
            this.numerator = -numerator / gcd;
            this.denominator = -denominator / gcd;
        } else {
            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;
        }
    }

    private static Rational negative(Rational that) {
        return new Rational(-that.numerator, that.denominator);
    }


    public Rational plus(Rational that) {
        return new Rational(this.numerator * that.denominator + this.denominator * that.numerator, this.denominator * that.denominator);
    }

    public Rational minus(Rational that) {
        return plus(negative(that));
    }

    public Rational times(Rational that) {
        return new Rational(this.numerator * that.numerator, this.denominator * that.denominator);
    }

    public Rational dividedBy(Rational that) {
        return new Rational(this.numerator * that.denominator, this.denominator * that.numerator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return numerator == rational.numerator && denominator == rational.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

}
