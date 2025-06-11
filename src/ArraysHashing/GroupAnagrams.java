package ArraysHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] input={"act","pots","tops","cat","stop","hat"};
        List<List<String>> groupedAnagrams = groupAnagrams(input);
        System.out.println(groupedAnagrams);
    }

   public static List<List<String>> groupAnagrams(String[] strs){
        // if length is null or 0

       if(strs==null || strs.length==0){
           return new ArrayList<>(); // returns an empty list
       }

       HashMap<String,List<String>> map=new HashMap<>();
       for(String s: strs){
           //key->value

           char[] chars=s.toCharArray();
           Arrays.sort(chars);
           String sorted=new String(chars); // sorted string

           if(!map.containsKey(sorted)){
               map.put(sorted,new ArrayList<>());
           }
           map.get(sorted).add(s);
       }
       return new ArrayList<>(map.values());
   }


}
