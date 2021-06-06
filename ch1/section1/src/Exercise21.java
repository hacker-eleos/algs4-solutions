import edu.princeton.cs.algs4.StdIn;

public class Exercise21 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append(new String(new char[25]).replace("\0", "-")).append("|").append(new String(new char[25]).replace("\0", "-")).append("\n");
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int x = StdIn.readInt();
            int y = StdIn.readInt();
            float result = (float) x / (float) y;
            String toPrint = String.format("%-25s" + "|%25.3f", name, result);
            stringBuilder.append(toPrint).append("\n");
        }
        System.out.println(stringBuilder);
    }
}
