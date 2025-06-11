package DP;

import java.util.Arrays;

// recursion approach
public class frogJump {
    public static void main(String[] args) {
        int n=5;
        int[] memo=new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println("Number of ways to reach the " + n + "th step: " + countWays(n,memo));
    }

    public static int countWays(int n, int[] dp){

        if(n<0){
            return 0;
        }

        if(n==0) {
            return 1;
        }

        if(dp[n]!=1){
            return dp[n];
        }

        dp[n]=countWays(n-1,dp)+countWays(n-2,dp)+countWays(n-3,dp);
        return dp[n];
    }

}
