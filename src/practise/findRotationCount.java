package practise;
public class findRotationCount{
    public static void main(String[] args) {
         int[] nums={3,4,5,1,2};
        System.out.println(findRotationCount(nums));
    }
//         4,5,1,2,3
    public static int findRotationCount(int[] nums){
        int start=0;
        int end=nums.length-1;

        if(nums[start]<nums[end]){
            return 0; // array is not rotated
        }

        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;
    }
}