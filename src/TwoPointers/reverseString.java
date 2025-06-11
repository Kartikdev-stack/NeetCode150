package TwoPointers;

import java.util.Arrays;

public class reverseString {

    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        System.out.println(Arrays.toString(s)); // original
        reverseString(s);//reversed
        System.out.println(Arrays.toString(s)); // reversed output with two-pointer approach
    }

    public static void reverseString(char[] s){
         int left=0;
         int right=s.length-1;

         while(left<right){
             swap(s, left, right);
             left++;
             right--;
         }
    }

    public static void swap(char[] arr, int left, int right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }


}
