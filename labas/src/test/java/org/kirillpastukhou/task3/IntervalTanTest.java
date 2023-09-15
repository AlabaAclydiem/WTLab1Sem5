package org.kirillpastukhou.task3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntervalTanTest {
    public static final double EPS = 0.001;
    @Test
    void calculateIntervalTest1() {
        IntervalTan itan = new IntervalTan();
        ArrayList<double[]> result = itan.calculateInterval(1, 2, 0.5);
        double[][] correct = {{1.0, 1.5574077}, {1.5, 14.101419}, {2.0, -2.185039}};
        boolean ok = true;

        for (int i = 0; i < result.size(); i++) {
            ok = ok && Math.abs(result.get(i)[0] - correct[i][0]) < EPS &&
                    Math.abs(result.get(i)[1] - correct[i][1]) < EPS;
        }
        assertTrue(ok, "Test1 Failed");
    }
}