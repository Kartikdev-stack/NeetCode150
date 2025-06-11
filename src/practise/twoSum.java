package practise;


import java.util.Arrays;
import java.util.HashMap;

// Optimised Approach
public class twoSum {

    public static void main(String[] args) {
        int[] arr={3,2,4,3};
        System.out.println(Arrays.toString(twoSum(arr,6)));

    }

    public static int[] twoSum(int[] nums, int target){
        // Defining a HashMap
        HashMap<Integer,Integer> hm=new HashMap<>();

        // Indekses are stored as values while array values as keys
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                return new int[] {hm.get(target-nums[i]),i};
            }
            hm.put(nums[i],i);
        }

        return new int[] {-1,-1};
    }

}
