package org.kirillpastukhou.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LISCheckerTest {

    @Test
    void minimumNumDeletionsToGetLISTest1() {
        int[] array = {4, 3, 5, 1, 7, 8, 2, 9, 1, 10};
        int correct = 4;
        LISChecker checker = new LISChecker();
        assertEquals(checker.minimumNumDeletionsToGetLIS(array), correct);
    }

    @Test
    void minimumNumDeletionsToGetLISTest2() {
        int[] array = {7, 1, 2, 3};
        int correct = 1;
        LISChecker checker = new LISChecker();
        assertEquals(checker.minimumNumDeletionsToGetLIS(array), correct);
    }
}