package org.kirillpastukhou.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x:");
        if (scanner.hasNextDouble()) {
            x = scanner.nextDouble();
        } else {
            System.out.println("It is not a real number!");
            return;
        }

        System.out.println("Enter y:");
        if (scanner.hasNextDouble()) {
            y = scanner.nextDouble();
        } else {
            System.out.println("It is not a real number!");
            return;
        }

        Figure figure = new Figure();
        if (figure.isPointIn(x, y)) {
            System.out.println("Point is inside figure");
        } else {
            System.out.println("Point is outside figure");
        }
    }
}