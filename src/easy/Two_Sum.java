package easy;

import java.util.Arrays;
import java.util.HashMap;

//
public class Two_Sum {
    public static void main(String[] args) {
        int[] arr={3,2,4,3};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                return new int[] {hm.get(target-nums[i]),i};
            }
            hm.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
