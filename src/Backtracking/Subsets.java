package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

     public static List<List<Integer>> subsets(int[] nums){
         List<List<Integer>> resultList=new ArrayList<>();

         // Backtracking starts here
         backtrack(resultList,new ArrayList<>(),nums,0);
         return resultList;
     }
     // [1,2,3]
     private static void backtrack(List<List<Integer>> resultsSet, List<Integer> tempSet, int[] nums, int start){
         resultsSet.add(new ArrayList<>(tempSet));  // adding an empty list at the start

         for (int i=start;i<nums.length;i++){
               tempSet.add(nums[i]);

               backtrack(resultsSet,tempSet,nums,i+1); // this is basically the start of inclusion process

               tempSet.remove(tempSet.size()-1);
         }

     }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }

}
