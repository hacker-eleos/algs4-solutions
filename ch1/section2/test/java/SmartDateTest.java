import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Calendar;
import java.util.Random;

class SmartDateTest {
    private final static String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static Random random;
    private static long[] arrayOfSeconds;

    @DisplayName("Before setting up, create test cases")
    @BeforeEach
    void setUp() {
        random = new Random();
        arrayOfSeconds = random.longs(1000, 0, System.currentTimeMillis()).toArray();
    }

    @RepeatedTest(50)
    @DisplayName("Repeated testing for multiple cases")
    void dayOfTheWeek() {
        for (long arrayOfSecond : arrayOfSeconds) {
            Calendar calendar = Calendar.getInstance();
            calendar.setLenient(false);
            calendar.setTimeInMillis(arrayOfSecond);
            int day = calendar.get(Calendar.DAY_OF_WEEK);
            SmartDate smartDate = new SmartDate(calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.YEAR));
            Assertions.assertEquals(days[day - 1], smartDate.dayOfTheWeek());
        }
    }
}