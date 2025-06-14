package practise;


// Example of Backtracking


import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> resultList=new ArrayList<>();

        backtrack(resultList, new ArrayList<>(),nums, 0 );

        return resultList;
    }

    public static void backtrack(List<List<Integer>> resultsSet, List<Integer> tempSet, int[] nums, int start){

        resultsSet.add(new ArrayList<>(tempSet));

        for(int i=start;i<nums.length;i++){
            // Including the number

            tempSet.add(nums[i]);

            // Backtrack the new subset
            backtrack(resultsSet,tempSet,nums,i+1);

            // Case of not including the number

            tempSet.remove(tempSet.size()-1);
        }

    }



}
