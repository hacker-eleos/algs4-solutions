import java.util.concurrent.atomic.AtomicInteger;

public class Exercise9 {

    public static String toBinaryString(int a) {
        StringBuilder binaryString = new StringBuilder();
        AtomicInteger power = new AtomicInteger(1);
        while (power.get() <= a / 2) {
            power.updateAndGet(v -> v * 2);
        }
        while (power.get() > 0) {
            if (a < power.get()) binaryString.append("0");
            else {
                binaryString.append("1");
                a -= power.get();
            }
            power.set(power.get() / 2);
        }
        return binaryString.toString();
    }
}
