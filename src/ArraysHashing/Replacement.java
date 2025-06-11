package ArraysHashing;

import java.util.ArrayList;
import java.util.Arrays;

public class Replacement {
    public static void main(String[] args) {
         //AAABABB
        String s="AAABABBA";
        System.out.println(characterReplacement(s,1));
    }

    public static int characterReplacement(String s, int k){
        // Sliding Window Approach
//        ArrayList<Character> list=new ArrayList<>();

//        AAABABB
        int left=0;
        int maxFreq=0;
        int maxWindow=0;
        int[] freq=new int[26]; // logging frequencies of each of the 26 alphabets

        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++; // updating the frequency at that character

            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);  // logging the maximum frequency among all the characters encountered

            int windowLength=right-left+1;

            if(windowLength-maxFreq>k){
                freq[s.charAt(right)-'A']--;
                left++;
            }

            windowLength=right-left+1;
            maxWindow=Math.max(maxWindow,windowLength);

        }


        return maxWindow;

    }


}
