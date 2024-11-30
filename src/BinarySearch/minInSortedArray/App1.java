package BinarySearch.minInSortedArray;
// Brute Force Approach O(N)
// Find Minimum in Rotated Sorted Array


public class App1 {
    public static void main(String[] args) {
         int[] nums={1,2,3,4,5,6};
        System.out.println(findMin(nums));
    }


    public static int findMin(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return nums[i+1];
            }
        }
        return nums[0];
    }

}
