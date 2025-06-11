package ArraysHashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LCS {
    public static void main(String[] args) {
        int[] nums={0,3,2,5,4,6,1,1};
        System.out.println(longestConsecutive(nums));
    }


    // Brute Force Approach
//    public static int longestSubS(int[] nums){
//        // check for the predecessor
//        int longestStreak=0;
//
//        for(int i=0;i<nums.length;i++){
//
//            boolean isStart=true;
//            for(int j=0;j<nums.length;j++){
//                if(nums[j]==nums[i]-1){
//                    isStart=false;
//                    break;
//                }
//            }
//
//            if(isStart){
//                int currentNum=nums[i];
//                int currentStreak=1;
//
//                while(contains(nums,currentNum+1)){
//                    currentNum++;
//                    currentStreak++;
//                }
//                longestStreak=Math.max(longestStreak,currentNum);
//            }
//
//        }
//        return longestStreak;
//
//    }
//
//    public static boolean contains(int[] nums,int target){
//        for(int num: nums){
//            if(num==target)
//                return true;
//        }
//        return false;
//    }
//


    public static int longestConsecutive(int[] nums){
        Set<Integer> numSet=new HashSet<>();
        for(int num: nums){
            numSet.add(num);
        }
        int longest=0;

        for(int num: numSet){
            if(!numSet.contains(num-1)){
                int length=1;
                while(numSet.contains(num+length)){
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }



}
