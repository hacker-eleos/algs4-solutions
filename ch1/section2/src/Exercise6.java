public class Exercise6 {
    public static boolean isRotation(String p, String q) {
        return (p.length() == q.length()) && p.concat(p).contains(q);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("TGACGAC", "ACTGACG"));
        System.out.println(isRotation("ACTGACG", "TGACGAC"));
        System.out.println(isRotation("ABCDEF", "EFABCD"));
    }

}
