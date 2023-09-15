package org.kirillpastukhou.task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextDouble();
        }

        SomeSort sort = new SomeSort();
        array = sort.sort(array);
        for (double element : array) {
            System.out.print(element);
            System.out.print(" ");
        }
    }
}