package org.kirillpastukhou.task8;

public class Combiner {
    public int[] indexesToInsert(double[] a, double[] b) {
        int an = a.length, bn = b.length;
        int[] indexes = new int[bn];
        int i = 0, j = 0;
        while (j < bn && i < an) {
            if (a[i] > b[j]) {
                indexes[j] = i;
                j++;
            } else {
                i++;
            }
        }
        for (i = j; i < bn; ++i) {
            indexes[i] = an;
        }
        return indexes;
    }
}
