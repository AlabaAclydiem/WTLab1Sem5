package org.kirillpastukhou.task1;

public class Equation {
    public double calculateEquation(double x, double y) {
        double numerator = 1 + Math.sin(x + y) * Math.sin(x + y);
        double denominator = 2 + Math.abs(x - (2 * x) / (1 + x * x * y * y));
        return numerator / denominator + x;
    }
}
