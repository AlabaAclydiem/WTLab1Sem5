package org.kirillpastukhou.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinerTest {

    @Test
    void indexesToInsertTest1() {
        double[] input_a = {1, 1, 5}, input_b = {1, 2, 5, 6};
        int[] correct = {2, 2, 3, 3};
        Combiner comb = new Combiner();
        int[] output = comb.indexesToInsert(input_a, input_b);
        assertArrayEquals(correct, output);
    }
}