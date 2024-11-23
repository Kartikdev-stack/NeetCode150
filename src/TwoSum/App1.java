package TwoSum;
// Brute Force
//Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        int[] arr={4,5,6};
        System.out.println(Arrays.toString(twoSum(arr,10)));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] result=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                     result[0]=i;
                     result[1]=j;
                }
            }
        }
        return result;
    }


}
