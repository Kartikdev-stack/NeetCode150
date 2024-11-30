package ArraysHashing.ContainsDuplicate;

import java.util.HashSet;

// Optimised Method
// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
public class App1 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate(int[] nums){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i< nums.length;i++){
            if(!hs.add(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}
