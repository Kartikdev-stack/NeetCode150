package practise;


import java.util.HashSet;
import java.util.Set;

public class LongestSSWRC {

    public static void main(String[] args) {
         String s="zxyzxyz";
        System.out.println(lengthOfLongestSubstring(s));
    }

//    public static int lengthOfLongestSubstring(String s){
//        int length=0;
//
//        for(int i=0;i<s.length();i++){
//            Set<Character> set=new HashSet<>();
//            for(int j=i;j<s.length();j++){
//                if(set.contains(s.charAt(j))){
//                    break;
//                }
//                set.add(s.charAt(j));
//            }
//            length=Math.max(length,set.size());
//
//        }
//
//        return length;
//    }

    public static int lengthOfLongestSubstring(String s){
        int start=0;
        int maxLength=0;
        Set<Character> set=new HashSet<>();

        for(int end=0;end<s.length();end++) {
            while(set.contains(s.charAt(end))){
                set.remove((s.charAt(start)));
                start++;
            }
            set.add(s.charAt(end));
            maxLength=Math.max(maxLength,set.size());
        }

        return maxLength;
    }


}
