package slidingWIndow.permutationInString;

// Optimised approach with sliding window

import java.util.HashMap;

public class app2 {

    public static void main(String[] args) {
        System.out.println(permString("abc","lecqbee"));
    }


    public static boolean permString(String s1,String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        // define the hashmap for s1

        HashMap<Character, Integer> s1_map = new HashMap<>();
        char[] s1_arr = s1.toCharArray();

        for (char c : s1_arr) {
            s1_map.put(c, s1_map.getOrDefault(c, 0) + 1);
        }

        //
        // define the hashmap for s2

        HashMap<Character,Integer> s2_map=new HashMap<>();


        for(int end=0;end<s2.length();end++){
            char chAdd=s2.charAt(end);
            s2_map.put(chAdd,s2_map.getOrDefault(chAdd,0)+1);


            if(end >= s1.length()){
                char charRem=s2.charAt(end-s1.length());
                if(s2_map.get(charRem)==1){
                    s2_map.remove(charRem);
                }else {
                    s2_map.put(charRem,s2_map.get(charRem)-1); // decreasing the freq by 1
                }
            }


            if(s1_map.equals(s2_map)){
                return true;
            }

        }

       return false;
    }
}
