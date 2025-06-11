package BinarySearch.Koko_Eating_Bananas;

import java.util.Arrays;
import java.util.Map;

public class BruteForce {
    public static void main(String[] args) {
         int[] piles={25,10,23,4};
         System.out.println(minEatingSpeed(piles,4));
    }

    public static int minEatingSpeed(int[] piles, int h){

        Arrays.sort(piles);

        for(int speed=1;speed<=piles[piles.length-1];speed++){

            int totalHours=0;

            for(int pile: piles){
                totalHours+=Math.ceil((double) pile/speed);
            }

            if(totalHours<=h){
                return speed;
            }
        }

        return -1;
    }
}
