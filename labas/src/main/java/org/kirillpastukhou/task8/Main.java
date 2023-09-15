package org.kirillpastukhou.task8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[] a = new double[n], b = new double[m];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextDouble();
        }
        for (int i = 0; i < m; ++i) {
            b[i] = scanner.nextDouble();
        }

        Combiner comb = new Combiner();
        int[] indexes = comb.indexesToInsert(a, b);
        for (int i = 0; i < m; ++i) {
            System.out.print(indexes[i]);
            System.out.print(" ");
        }
    }
}