package Sorting;

import java.util.Arrays;
// setting the first element as the smallest one in each pass

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    swap(arr,i,j);
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
