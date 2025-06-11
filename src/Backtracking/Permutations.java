package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {



    public static void main(String[] args) {

    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        Arrays.fill(used,false);

        backtrack(result,new ArrayList<>(), nums, used, 0);

        return result;
    }

    public static void backtrack(List<List<Integer>> resultSet, List<Integer> temp, int[] nums, boolean[] used, int start){

        if(temp.size()==nums.length) {
            resultSet.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length;i++){

             if(used[i]){
                 continue;
             }

             temp.add(nums[i]); // Number is considered
             used[i]=true;



             backtrack(resultSet,temp,nums,used,0);


             temp.remove(temp.size()-1);
             used[i]=false;
        }
    }


}
