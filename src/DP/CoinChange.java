package DP;

import java.util.Arrays;

public class CoinChange {
    public static int minCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);  // Initialize all dp entries to Integer.MAX_VALUE
        dp[0] = 0;  // Base case: no coins needed to make amount 0

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];  // Check if the amount can be formed
    }

    public static void main(String[] args) {
        int[] coins = {2};
        int amount = 3;
        int minCoins = minCoins(coins, amount);
        System.out.println("Minimum number of coins: " + minCoins);
    }
}
