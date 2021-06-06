import edu.princeton.cs.algs4.StdOut;

public class Exercise11 {
    public static void print(boolean[][] a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  ");
        for (int i = 0; i < a[0].length; i++) {
            stringBuilder.append(String.format("%d ", i));
        }
        stringBuilder.append("\n");
        for (int i = 0; i < a.length; i++) {
            stringBuilder.append(String.format("%d ", i));
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]) stringBuilder.append("* ");
                else stringBuilder.append("  ");
            }
            stringBuilder.append("\n");
        }
        StdOut.println(stringBuilder);
    }

    public static void main(String[] args) {
        boolean[][] b = {{true, true, true, true}, {true, false, true, true}, {true, true, false, true}};
        print(b);
        b = new boolean[][]{{true, false, true}, {false, true, true}, {true, true, false}};
        print(b);
    }
}
