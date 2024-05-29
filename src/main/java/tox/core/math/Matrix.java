package tox.core.math;

public class Matrix {
    public final int rows, cols;
    private final double[][] mat;

    public Matrix(int rows, int cols) throws IllegalArgumentException {
        if(rows < 0 || cols < 0) throw new IllegalArgumentException("Negative bounds ${rows} and ${cols} not allowed");
        this.rows = rows;
        this.cols = cols;
        mat = new double[rows][cols];
    }

    public Matrix(double[][] mat) {
        this.mat = mat;
        this.rows = mat.length;
        this.cols = mat[0].length;
    }

    public double getDeterminant() {
        //TODO: Implement
        return -1;
    }

    public double get(int row, int col) {
        return mat[row][col];
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Matrix m)) return false;
        if(m.cols != cols || m.rows != rows) return false;

        for (int i = 0; i < m.rows; i++) {
            for (int j = 0; j < m.cols; j++) {
                if (m.get(i, j) != mat[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
