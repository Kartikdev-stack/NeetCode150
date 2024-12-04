package BinarySearch.minInSortedArray;
// Optimised approach with Binary Search


public class App2 {
    public static void main(String[] args) {
        int[] arr={5,6,1,2,3,4};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr){
        // our goal is to find the pivot

        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[end]){
                // this means pivot is in the right
                start=mid+1;
            }else{
                end=mid;
            }
        }
       return arr[start]; // minimum element in the sorted array
    }

}
