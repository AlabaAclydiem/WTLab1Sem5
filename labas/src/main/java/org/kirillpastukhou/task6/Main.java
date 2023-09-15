package org.kirillpastukhou.task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextDouble();
        }

        MatrixMaker maker = new MatrixMaker();
        double[][] answer = maker.makeMatrix(array);
        for (double[] row : answer) {
            for (double element : row) {
                System.out.print(element);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}