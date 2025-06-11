package TwoPointers;

//Container with most water
public class mostWater {

    public static void main(String[] args) {
        int[] arr={2,2,2};
        System.out.println(mostWater(arr));
    }

    public static int mostWater(int[] arr){
        int left=0;
        int right=arr.length-1;
        int maxArea=Integer.MIN_VALUE; // default maxArea to minimum

        while(left<=right){
            int height=Math.min(arr[left],arr[right]);  // calculating the height
            int width=right-left;  // calculating the width

            maxArea=Math.max(maxArea,height*width);

            if(arr[left]<arr[right]) {
                left++;
            }else
                right--;
        }

        return maxArea;
    }

}
