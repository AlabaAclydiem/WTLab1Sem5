package org.kirillpastukhou.task6;

public class MatrixMaker {
    public double[][] makeMatrix(double[] array) {
        int n = array.length;
        double[][] answer = new double[n][n];
        answer[0] = array;
        for (int i = 1; i < n; ++i) {
            double[] temp = new double[n];
            for (int j = 1; j < n; ++j) {
                temp[j - 1] = answer[i - 1][j];
            }
            temp[n - 1] = answer[i - 1][0];
            answer[i] = temp;
        }
        return answer;
    }
}
