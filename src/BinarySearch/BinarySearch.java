package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums={-1,0,2,4,6,8};
        System.out.println(binarySearch(nums,6));

    }

    public static int binarySearch(int[] nums,int target){
        // -1,0,2,3,4,6,8

        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
