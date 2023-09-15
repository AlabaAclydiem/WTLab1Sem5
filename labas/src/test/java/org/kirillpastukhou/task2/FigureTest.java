package org.kirillpastukhou.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    @Test
    void isPointInTest1() {
        Figure figure = new Figure();
        boolean result = figure.isPointIn(0, 0);
        assertTrue(result, "Test1 Failed\ninput: x=0, y=0\noutput: in");
    }

    @Test
    void isPointInTest2() {
        Figure figure = new Figure();
        boolean result = figure.isPointIn(-6.8, 2);
        assertFalse(result, "Test2 Failed\ninput: x=0, y=0\noutput: out");
    }

    @Test
    void isPointInTest3() {
        Figure figure = new Figure();
        boolean result = figure.isPointIn(-4, 2.1);
        assertTrue(result, "Test2 Failed\ninput: x=0, y=0\noutput: in");
    }
}