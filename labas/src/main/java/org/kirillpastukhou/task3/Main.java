package org.kirillpastukhou.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static double getDouble(Scanner scanner, String msg) {
        double temp = 0;
        System.out.println(msg);
        if (scanner.hasNextDouble()) {
            temp = scanner.nextDouble();
        } else {
            System.out.println("It is not a real number!");
            System.exit(1);
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, h;
        a = getDouble(scanner, "Enter a:");
        b = getDouble(scanner, "Enter b:");
        h = getDouble(scanner, "Enter h:");

        IntervalTan itan = new IntervalTan();
        ArrayList<double[]> x_y = itan.calculateInterval(a, b, h);
        System.out.printf("%5s", "x");
        System.out.printf("%15s\n", "y");
        for (double[] xy : x_y) {
            System.out.printf("%5f", xy[0]);
            System.out.printf("%15f\n", xy[1]);
        }
    }
}