package tox.core.math;

public class MatrixD {
    private final int rows, cols;
    private final double[][] mat;

    public MatrixD(int rows, int cols) throws IllegalArgumentException {
        if(rows < 0 || cols < 0) throw new IllegalArgumentException(STR."Negative bounds \{rows} and \{cols} not allowed");
        this.rows = rows;
        this.cols = cols;
        mat = new double[rows][cols];
    }

    public MatrixD(double[][] mat) {
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
        if(obj instanceof MatrixD m) {
            if(m.cols == cols && m.rows == rows) {
                for(int i = 0; i < m.rows; i++) {
                    for(int j = 0; j < m.cols; j++) {
                        if(m.get(i, j) != mat[i][j]) {
                            break;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
