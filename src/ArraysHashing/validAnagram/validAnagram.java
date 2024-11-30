package ArraysHashing.validAnagram;

import java.util.HashMap;
// Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

public class validAnagram {
    public static void main(String[] args) {
        System.out.println(validAnagram("racecar","carrace"));
    }

    public static boolean validAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> charCount=new HashMap<>();
        for(char c: s.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()){

            if(!charCount.containsKey(c) || charCount.get(c)==0){
                return false;
            }
            charCount.put(c,charCount.get(c)-1);
        }

        for(char c: s.toCharArray()){
            if(charCount.get(c)!=0){
                return false;
            }
        }


       return true;
    }

}
