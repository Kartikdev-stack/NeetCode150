package slidingWIndow;

public class MaxSubArray {

    public static void main(String[] args) {

        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }


    public static double findMaxAverage(int[] nums, int k) {
        int left=0;
        double max_avg=Integer.MIN_VALUE;
        double current=0;


        for(int right=0;right<k;right++){
            current=current+nums[right];  // calculating sum for first k elements
        }

        max_avg=Math.max(max_avg,current/k);

        for(int right=k;right<nums.length;right++){

            current=current+nums[right]-nums[left];
            max_avg=Math.max(max_avg,current/k);
            left++;

        }

        return max_avg;
    }


}
