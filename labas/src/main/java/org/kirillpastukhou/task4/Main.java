package org.kirillpastukhou.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextInt();
        }

        PrimeDetector detector = new PrimeDetector();
        Integer[] prime_indexes = detector.getPrimesIndexes(array);
        for (Integer elem : prime_indexes) {
            System.out.print(elem);
            System.out.print(" - ");
            System.out.println(array[elem]);
        }
    }
}