package org.kirillpastukhou.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeDetectorTest {

    @Test
    void getPrimesIndexesTest() {
        PrimeDetector detector = new PrimeDetector();
        int[] arr = {1, 2, 6, 10, 19, 25, 31};
        Integer[] correct = {1, 4, 6};
        Integer[] result = detector.getPrimesIndexes(arr);
        assertArrayEquals(result, correct);
    }
}