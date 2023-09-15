package org.kirillpastukhou.task4;

import java.util.ArrayList;

public class PrimeDetector {
    public Integer[] getPrimesIndexes(int[] array) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < array.length; ++i) {
            if (isPrime(array[i])) {
                indexes.add(i);
            }
        }
        Integer[] prim_indexes = indexes.toArray(new Integer[indexes.size()]);
        return prim_indexes;
    }

    private boolean isPrime(int number) {
        if (number == 1) return false;
        int bound = (int)Math.sqrt(number);
        for (int divisor = 2; divisor <= bound; ++divisor) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
