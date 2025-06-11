package DP;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    private static int[] memo;

    public static void main(String[] args) {
        // Test case: [9,1,4,2,3,3,7]
        int[] nums = {9, 1, 4, 2, 3, 3, 7};
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + lengthOfLIS(nums));
        System.out.println("Expected: 4 (LIS: [1,2,3,7])");
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        memo = new int[n];
        Arrays.fill(memo, -1);

        int maxLIS = 1; // maximum length of subsequence
        for (int i = 0; i < n; i++) {
            maxLIS = Math.max(maxLIS, dfs(nums, i)); // checking the best starting position
        }

        return maxLIS;
    }

    public static int dfs(int[] nums, int i) {
        if (memo[i] != -1)
            return memo[i];

        int LIS = 1; // current element is always included

        // Try all positions after i
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] < nums[j]) { // can extend the subsequence
                LIS = Math.max(LIS, 1 + dfs(nums, j));
            }
        }

        memo[i] = LIS;
        return LIS;
    }
}