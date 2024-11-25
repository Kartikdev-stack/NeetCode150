package minInSortedArray;
// Optimised approach with Binary Search


public class App2 {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,1,2};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums){
         if(nums.length==0)
             return -1;
         if(nums.length==1)
             return nums[0];

         int left=0;
         int right=nums.length-1;

         while(left<right){
             int mid=left+(right-left)/2;
             if(nums[mid]<nums[mid-1]){
                 return nums[mid];
             }else if(nums[left] <= nums[mid] && nums[mid]>nums[right] ){
                 left=mid+1;
             }else {
                 right=mid-1;
             }
         }
         return nums[left];
    }

}
