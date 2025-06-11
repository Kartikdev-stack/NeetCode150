package LinkedList;

public class duplicate {

    // Optimal Time O(1) and O(N) space with HashSset. We are expecting a solution with O(1) space.


    public static void main(String[] args) {
          int[] nums={1,4,2,2,3};
        System.out.println(findDuplicate(nums));
    }

//    public static int findDuplicate(int[] nums){
//        for(int num: nums){
//            int idx=Math.abs(num)-1;
//            if(nums[idx]<0){
//                return Math.abs(num);
//            }
//            nums[idx]*=-1;
//        }
//        return -1;
//    }

 // Approach using fast and slow pointers
      // Floyds cycle detection is a prime example of cases where space complexity is O(1)

      public static int findDuplicate(int[] nums){

             int slow=nums[0];
             int fast=nums[0];

             do{
                 slow=nums[slow];
                 fast=nums[nums[fast]];
             }while (slow!=fast);


             slow=nums[0];
             while(slow!=fast){
                 slow=nums[slow];
                 fast=nums[fast];
             }
             return slow;
      }



}
