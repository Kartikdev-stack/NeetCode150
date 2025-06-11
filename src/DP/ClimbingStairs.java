package DP;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
       int n=5; // no of stairs
        int memo[]=new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println(climbingStairs(n,memo));
    }

    public static int climbingStairs(int n, int[] dp){

        if(n==1 || n==0){
            return 1;
        }

        if(dp[n]!=-1)
            return dp[n];

        dp[n]=climbingStairs(n-1,dp)+climbingStairs(n-2,dp);
        return dp[n];
    }


}
