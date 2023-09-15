package org.kirillpastukhou.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextInt();
        }

        LISChecker checker = new LISChecker();
        System.out.println(checker.minimumNumDeletionsToGetLIS(array));
    }
}