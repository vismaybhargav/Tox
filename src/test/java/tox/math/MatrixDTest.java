package tox.math;


import org.junit.jupiter.api.Test;
import tox.core.math.Matrix;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixDTest {
    @Test
    void testEquals() {
        Matrix mat1 = new Matrix(2, 2);
        Matrix mat2 = new Matrix(2, 2);
        assertEquals(mat1, mat2);
    }
}
