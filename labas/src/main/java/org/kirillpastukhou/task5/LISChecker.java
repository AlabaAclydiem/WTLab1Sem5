package org.kirillpastukhou.task5;

public class LISChecker {
    public int minimumNumDeletionsToGetLIS(int[] array) {
        int[] dp = new int[array.length];
        dp[0] = 1;
        for (int i = 1; i < array.length; ++i) {
            dp[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (array[i] > array[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        return array.length - dp[array.length - 1];
    }
}
