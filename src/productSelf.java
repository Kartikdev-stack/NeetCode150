import java.util.Arrays;

public class productSelf {
    public static void main(String[] args) {
       int[] nums={3,2,4,6};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    // BRUTE FORCE APPROACH

//    public static int[] productExceptSelf(int[] nums){
//        int[] result=new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            int product=1;
//            for(int j=0;j<nums.length;j++){
//                if(i!=j){
//                    product=product*nums[j];
//                }
//            }
//            result[i]=product;
//        }
//        return result;
//    }

    public static int[] productExceptSelf(int[] nums){
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        int[] result=new int[nums.length];

        // adding elements in prefix array
        for(int i=1;i<nums.length;i++){
            prefix[0]=1;
            prefix[i]=prefix[i-1]*nums[i-1]; // product upto previous number excluding the current
        }

        // adding elements in suffix array
        for(int i=nums.length-2;i>=0;i--){
            suffix[nums.length-1]=1;
            suffix[i]=suffix[i+1]*nums[i+1]; // product of all the further element excluding the current
        }

        // multiplying results in an array
        for(int i=0;i<nums.length;i++){
            result[i]=prefix[i]*suffix[i];
        }

        return result;
    }


}
