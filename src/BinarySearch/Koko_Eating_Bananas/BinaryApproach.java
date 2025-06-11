package BinarySearch.Koko_Eating_Bananas;

import java.util.Arrays;

public class BinaryApproach {

    public static void main(String[] args) {
        int[] piles={25,10,23,4};
        System.out.println(minHours(piles,4));
    }

    public static int  minHours(int[] piles, int h){

        // we sort the array first to calcuate the range

        Arrays.sort(piles);

        int start=1;
        int end=piles[piles.length-1];
        int result=-1;


        while(start<=end){
            int totalHours=0;
            int mid=start+(end-start)/2;

            for(int pile: piles){
                totalHours+=Math.ceil((double) pile/mid);
            }

            if(totalHours<=h){
                result=mid;
                end=mid-1;
            }else{
                start=mid+1; // basically we are going tooo slow, capturing a lot of time hence increase the speed
            }
        }
        return result;
    }

}
