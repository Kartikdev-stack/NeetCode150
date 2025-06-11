package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    static List<List<Integer>> result=new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] nums, int target) {


       combinationSum(nums,0,new ArrayList<>(),target);

       return result;
    }

    public static void combinationSum(int[] nums, int start, List<Integer> tempList, int target){

        if(target==0){
            result.add(new ArrayList<>(tempList));
            return;
        }

        if(target<0 || start>=nums.length){
            return;
        }


        tempList.add(nums[start]);  // adding the first element in the temp list

        combinationSum(nums,start,tempList,target-nums[start]);

        tempList.remove(tempList.size()-1);

        combinationSum(nums,start+1,tempList,target);



    }

    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(combinationSum(nums,2));
    }


}
