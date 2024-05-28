package tox.math;


import org.junit.jupiter.api.Test;
import tox.core.math.MatrixD;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixDTest {
    @Test
    void testEquals() {
        MatrixD mat1 = new MatrixD(2, 2);
        MatrixD mat2 = new MatrixD(2, 2);
        assertEquals(mat1.equals(mat2), true);
    }
}
