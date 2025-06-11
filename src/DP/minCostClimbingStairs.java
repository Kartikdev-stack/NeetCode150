package DP;

import Graphs.BFS.WallsGates;

import java.util.HashMap;
import java.util.Map;

public class minCostClimbingStairs {

    public static void main(String[] args) {
        int[] cost={1,2,1,2,1,1,1};
        int min_cost=minCostClimbingStairs(cost);
        System.out.println("Minimum cost is: "+min_cost);
    }

    // Memoization approach - Top and Bottom
    public static int minCostClimbingStairs(int[] cost) {
         Map<Integer,Integer> memo=new HashMap<>();
         return minCostClimbingStairs(cost, cost.length, memo);
    }

    public static int minCostClimbingStairs(int[] cost, int i, Map<Integer,Integer> memo){

        // Defining the base cases

        if(i==0){
            return 0;
        }

        if(i==1) {
            return 0;
        }

        // Check the memoization cache if the cost is aldready calcualted for the stair

        if(memo.containsKey(i)){
            return memo.get(i);
        }

        // Recursion

        int min_cost=Math.min(cost[i-1]+minCostClimbingStairs(cost,i-1,memo),cost[i-2]+minCostClimbingStairs(cost,i-2,memo));

        memo.put(i,min_cost);

        return min_cost;


    }




}
