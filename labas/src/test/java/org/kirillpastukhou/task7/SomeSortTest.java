package org.kirillpastukhou.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeSortTest {

    @Test
    void sortTest1() {
        double[] input = {1, 5, 0, 3, 9};
        double[] correct = {0, 1, 3, 5, 9};
        SomeSort sort = new SomeSort();
        double[] output = sort.sort(input);
        assertArrayEquals(output, correct);
    }

    @Test
    void sortTest2() {
        double[] input = {1, 5.9, 0, 5.8, 9};
        double[] correct = {0, 1, 5.8, 5.9, 9};
        SomeSort sort = new SomeSort();
        double[] output = sort.sort(input);
        assertArrayEquals(output, correct);
    }
}