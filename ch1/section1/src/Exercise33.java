import java.util.Arrays;

public class Exercise33 {
    /**
     * To do: Test client for Matrix class and methods.
     *
     * @param args
     *
     */
    public static void main(String[] args) {
        double[][]  a = {{1.0, 0}, {0.0, 1.0}};
        double[][] b = {{1.2, 0.2, 0.1},{1.0, 0.0, 1.1}};
        System.out.println(Arrays.deepToString(Matrix.mult(a, b)));
        System.out.println(Arrays.deepToString(Matrix.transpose(b)));
        System.out.println(Arrays.deepToString(Matrix.transpose(a)));
        double[][] c = {{1.1, 3.2, 0.7}};
        try{
            Matrix.mult(b, c);
        }catch (IllegalArgumentException exception){
            exception.printStackTrace();
        }
        double[] y = {1.1, 2.1};
        double[] result = Matrix.mult(y, b);
        System.out.println(Arrays.toString(result));
    }
}

