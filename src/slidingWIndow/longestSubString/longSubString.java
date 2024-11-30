package slidingWIndow.longestSubString;

import java.util.HashSet;
import java.util.Set;

public class longSubString {

    public static void main(String[] args) {
        //  "yxzxyabcxz"
        System.out.println(longestSS("yxzxyabcxz"));
    }

    public static int longestSS(String s) {
        int start =0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {

            while(set.contains(s.charAt(end))){  // duplicate character detected
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
}
