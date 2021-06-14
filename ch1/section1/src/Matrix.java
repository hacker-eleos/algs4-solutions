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
        checkValidMatrix(a);
        checkValidMatrix(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b.length) throw new IllegalArgumentException("dimension mismatch");
        }
    }

    static double[][] mult(double[][] a, double[][] b) // matrix-matrix product
    {
        checkMultiplyArguments(a, b);
        int P = a.length;
        int Q = b.length;
        int R = b[0].length;
        double[][] c = new double[P][R];
        for (int i = 0; i < P; i++) {
            for (int j = 0; j < R; j++) {
                for (int k = 0; k < Q; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    static double[][] transpose(double[][] a) // transpose
    {
        checkValidMatrix(a);
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
        checkValidMatrix(a);
        if(a[0].length != x.length) throw new IllegalArgumentException("dimension mismatch");
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = dot(a[i], x);
        }
        return c;
    }

    static double[] mult(double[] y, double[][] a) // vector-matrix product
    {
        checkValidMatrix(a);
        if(y.length != a.length) throw new IllegalArgumentException("dimension mismatch");
        double[] c = new double[a[0].length];
        double[][] aTranspose = transpose(a);
        for (int i = 0; i < a[0].length; i++) {
            c[i] = dot(y, aTranspose[i]);
        }
        return c;
    }

    private static void checkValidMatrix(double[][] a) //  not ragged array
    {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1].length != a[i].length)
                throw new IllegalArgumentException("ragged array. all row sizes must be equal");
        }
    }
}
