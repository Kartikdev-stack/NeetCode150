package DP;

import java.util.Arrays;

public class HouseRobber {

    public static void main(String[] args) {
        int[] houses={2,9,8,3,6};
        int dp[] =new int[houses.length];
        Arrays.fill(dp,-1);
        System.out.println(rob(houses.length-1,houses,dp));
    }

    public static int rob(int i,int[] nums, int[] dp){

        // here dp[n] represents amount upto house n

        if(i==0){
            return nums[0];
        }

        if(i==1){
            return Math.max(nums[0],nums[1]);
        }

        if(dp[i]!=-1){
            return dp[i];
        }

        dp[i]=Math.max( nums[i]+rob(i-2,nums,dp),rob(i-1,nums,dp));

        return dp[i];
    }


}
