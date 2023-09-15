package org.kirillpastukhou.task1;

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

        Equation equation = new Equation();
        System.out.println("Calculating results:");
        System.out.println(equation.calculateEquation(x, y));
    }
}