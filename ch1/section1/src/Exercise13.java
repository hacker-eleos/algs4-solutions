import java.util.Arrays;

public class Exercise13 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(Arrays.deepToString(a));
        printTranspose(a);
    }

    public static void printTranspose(int[][] a) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                stringBuilder.append(a[i][j]).append(" ");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }
}
