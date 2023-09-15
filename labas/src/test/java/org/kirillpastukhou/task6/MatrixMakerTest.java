package org.kirillpastukhou.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixMakerTest {

    @Test
    void makeMatrixTest1() {
        double[] array = {1, 2, 3};
        MatrixMaker maker = new MatrixMaker();
        double[][] correct = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        double[][] answer = maker.makeMatrix(array);
        assertArrayEquals(answer, correct);
    }
}