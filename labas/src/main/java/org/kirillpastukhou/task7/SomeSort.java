package org.kirillpastukhou.task7;

public class SomeSort {
    public double[] sort(double[] array) {
        int n = array.length;
        int i = 0;
        while (i < n - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = Math.max(i - 1, 0);
            }
        }
        return array;
    }
}
