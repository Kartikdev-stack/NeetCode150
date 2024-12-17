package Sorting;

import java.util.Arrays;

// at each position or index, the elements upto that very position are sorted
public class insertionSort {

    public static void main(String[] args) {

            int[] arr={13,46,24,52,20,9};
                insertionSort(arr);
                System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    public static void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
