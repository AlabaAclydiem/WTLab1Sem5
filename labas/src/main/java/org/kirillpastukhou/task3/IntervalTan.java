package org.kirillpastukhou.task3;

import java.util.ArrayList;

public class IntervalTan {
    public static final double EPS = 0.0001;
    public ArrayList<double[]> calculateInterval(double a, double b, double h) {
        ArrayList<double[]> result = new ArrayList<double[]>();
        double i = a;
        while (i <= b + EPS) {
            double[] x_y = {i, Math.tan(i)};
            result.add(x_y);
            i += h;
        }
        return result;
    }
}
