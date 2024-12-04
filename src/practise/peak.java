package practise;

public class peak {

    public static void main(String[] args) {
        int[] nums={10,5,2,1};
        System.out.println(findPeak(nums));
    }

    public static int findPeak(int[] nums){
        int start=0;
        int end=nums.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;
    }
}
