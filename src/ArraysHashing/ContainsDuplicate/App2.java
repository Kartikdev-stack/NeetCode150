package ArraysHashing.ContainsDuplicate;


//Brute Force Approach
public class App2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,3};
        System.out.println(hasDuplicate(nums));
    }
    public static boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
