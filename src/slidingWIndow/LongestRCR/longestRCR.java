package slidingWIndow.LongestRCR;

import Graphs.BFS.WallsGates;

import java.util.HashMap;

public class longestRCR {

    public static void main(String[] args) {
          String input="AAABABB";
        System.out.println(characterReplacement(input,1));
    }

    public static int characterReplacement(String s, int k){
        HashMap<Character, Integer> count=new HashMap<>();
        int res=0;
        int maxFreq=0;
        int start=0;

        for(int end=0;end<s.length();end++){
            count.put(s.charAt(end),count.getOrDefault(s.charAt(end),0)+1);
            maxFreq=Math.max(maxFreq,count.get(s.charAt(end)));

            while((end-start+1) - maxFreq > k ){
                count.put(s.charAt(start),count.get(s.charAt(start))-1);
                start++;
            }

            res=Math.max(res,end-start+1);
        }
        return res;
    }

}
