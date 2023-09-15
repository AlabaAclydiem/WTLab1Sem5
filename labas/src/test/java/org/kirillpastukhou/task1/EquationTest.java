package org.kirillpastukhou.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EquationTest {
    public static final double EPS = 0.00001;

    @Test
    void calculateEquationTest1() {
        Equation equation = new Equation();
        boolean result = Math.abs(equation.calculateEquation(0,0)) - 0.5 < EPS;
        assertTrue(result, "Test1 Failed\ninput: x=0, y=0\noutput: 0.5");
    }

    @Test
    void calculateEquationTest2() {
        Equation equation = new Equation();
        boolean result = Math.abs(equation.calculateEquation(12.42,-9)) - 12.49459617 < EPS;
        assertTrue(result, "Test2 Failed\ninput: x=12.42, y=-9\noutput: 12.49459617");
    }
}