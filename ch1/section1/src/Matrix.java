public class Matrix {

    static double dot(double[] x, double[] y) // vector dot product
    {
        assert x.length == y.length : new IllegalArgumentException("x,y must be of same length");
        int N = x.length;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += x[i] * y[i];
        }
        return sum;
    }

    static void checkMultiplyArguments(double[][] a, double[][] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b.length) throw new IllegalArgumentException("dimension mismatch");
        }
    }

    static double[][] mult(double[][] a, double[][] b) // matrix-matrix product
    {
        checkMultiplyArguments(a, b);
        double[][] bTranspose = transpose(b);
        double[][] c = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j] += dot(a[i], bTranspose[j]);
            }
        }
        return c;

    }

    static double[][] transpose(double[][] a) // transpose
    {
        double[][] aTranspose = new double[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                aTranspose[i][j] = a[j][i];
            }
        }
        return aTranspose;
    }

    static double[] mult(double[][] a, double[] x) // matrix-vector product
    {
        throw new UnsupportedOperationException();
    }

    static double[] mult(double[] y, double[][] a) // vector-matrix product
    {
        throw new UnsupportedOperationException();
    }
}
