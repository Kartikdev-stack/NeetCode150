package BinarySearch;
// Search in Rotated Sorted Array
// Brute force would give a O(N) solution. We are looking for a O(logN) solution.
public class searchRSA {

    public static void main(String[] args) {
         int nums[]={4,5,6,7,0,1,2};
        System.out.println(search(nums,0));
    }

    public static int search(int[] nums, int target){
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            // now we will check where should the pivot lie
            if(nums[mid]==target){
                return mid;
            }

             if(nums[start]<=nums[mid]){
                // left seg is sorted
                if(nums[start]<=target && target<nums[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else{
                 // right section is sorted
                if(nums[mid]<target && target<=nums[end]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }

}
