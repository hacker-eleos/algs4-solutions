public class SmartDate {
    private static final int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int month;
    private final int day;
    private final int year;
    private final int[] commonYearOffset = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    private final int[] leapYearOffset = {0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
    private final String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public SmartDate(int month, int day, int year) {
        if (!isValidDate(month, day, year)) throw new IllegalArgumentException("invalid date");
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    private static boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > daysInMonth[month - 1]) return false;
        if (month == 2 && day == 29 && !isLeapYear(year)) return false;
        return true;
    }

    private static int R(int a, int b) {
        return a % b;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    public static void main(String[] args) {
        SmartDate smartDate = new SmartDate(1, 15, 1972);
        System.out.println(smartDate.dayOfTheWeek());
    }

    public String dayOfTheWeek() {
        int m;
        if (isLeapYear(this.year)) m = this.leapYearOffset[this.month - 1];
        else m = this.commonYearOffset[this.month - 1];
        int idx = R(day + m + 5 * R(year - 1, 4) + 4 * R(year - 1, 100) + 6 * R(year - 1, 400), 7);
        return days[idx];
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
