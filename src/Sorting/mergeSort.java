package Sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
         int[] arr={6,3,9,5,2,8};
         int n=arr.length;
         divide(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void conquer(int[] arr,int start,int mid,int end){
        int[] merged=new int[end-start+1];

        int index1=start;
        int index2=mid+1;
        int x=0;

        while(index1<=mid && index2<=end){
            if(arr[index1]<=arr[index2]){
                merged[x++]=arr[index1++];
            }else{  // case when index 2 is greater ( first element of second array )
                merged[x++]=arr[index2++];
            }
        }

        // cases when one of the arrays gets completed

        while(index1<=mid){ // case when array 2 gets terminated first
            merged[x++]=arr[index1++];
        }

        while(index2<=end){ // case when array 1 gets terminated first
            merged[x++]=arr[index2++];
        }

        for(int i=0,j=start;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }



    }


    public static void divide(int arr[], int start, int end){

        if(start>=end){
            return;
        }

         int mid=start+(end-start)/2; // get the mid index
        // starting the division process
        divide(arr,start,mid);  // left half
        divide(arr,mid+1,end); // right half
        conquer(arr,start,mid,end); // joining the sorted arrays
    }
}
