package practise;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {
        int[] nums={2,5,6,9};
        System.out.println(combinationSum(nums,9));
    }

    public static List<List<Integer>> combinationSum(int[] nums, int target){
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0, 0,target);

        return result;
    }

    public static void backtrack(List<List<Integer>> resultSet, List<Integer> tempList, int[] nums, int start,int sum, int target){

        if(sum==target){
            resultSet.add(new ArrayList<>(tempList));
            return;
        }

        if(sum> target){
            return;
        }

        for(int i=start;i<nums.length;i++){

            // we consider using the number

            tempList.add(nums[i]);

            // we call the backtracking function again with updated sum ( by adding current number) to explore deep with the same number

            backtrack(resultSet,tempList,nums,i,sum+nums[i],target);

            // backtracking done, we start removal of element now

            tempList.remove(tempList.size()-1);
        }
    }

}
