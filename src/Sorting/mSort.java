package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class mSort {

    public static void main(String[] args) {
        int[] arr={3,1,2,5,4};
        mergeSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int start, int end){

        if(start>=end){
            return;
        }

        int mid=start+(end-start)/2;
        mergeSort(arr,start,mid); // sorting the left half
        mergeSort(arr,mid+1,end); // sorting the right half
        conquer(arr,start,mid,end);  // joining the two sorted halves

    }

    public static void conquer(int[] arr, int start, int mid, int end){

        int index1=start;  // tracking the first sorted array
        int index2=mid+1;  // tracking the second sorted array
        int x=0;  // tracking the merged array
        int[] merged=new int[end-start+1];

        while(index1<=mid && index2<=end){
            if(arr[index1] <= arr[index2]){
                merged[x++]=arr[index1++];
            }else {
                merged[x++]=arr[index2++];
            }
        }

        while(index1<=mid){
            merged[x++]=arr[index1++];
        }

        while(index2<=end){
            merged[x++]=arr[index2++];
        }

        for(int i=0,j=start; i<merged.length; i++,j++){
            arr[j]=merged[i];
        }

    }


}
