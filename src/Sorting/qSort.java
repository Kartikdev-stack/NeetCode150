package Sorting;

// Sorting around the pivot element
import java.util.Arrays;

public class qSort {

    public static void main(String[] args) {
        int[] arr={2,4,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }

        int pivot=partition(arr,low,high);
        quickSort(arr,low,pivot-1); // sorting the left half of the pivot
        quickSort(arr,pivot+1,high); // sorting the right half of the pivot

    }

    public static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int counter=low-1; // counts the no of elements that are smaller than the pivot

        for(int i=low;i<high;i++){
            if(arr[i]<pivot){
                counter++;
                swap(arr,counter,i); // once we find that we have an element smaller than pivot we make a place for it starting from 0
            }
        }
        counter++; // positions the pivot right after the count of elements smaller than pivot
        swap(arr,counter,high);
        return counter;
    }

    public static void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }




}
