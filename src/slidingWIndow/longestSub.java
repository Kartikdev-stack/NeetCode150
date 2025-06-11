package slidingWIndow;

import java.util.HashSet;

public class longestSub {
    public static void main(String[] args) {
        String s="xxxx";
//      'b','c','a','b'
        System.out.println(longSS(s));
    }

    public static int longSS(String s){
        char[] arr=s.toCharArray();
        HashSet<Character> hs=new HashSet<>();
        int left=0; // left pointer does not necessarily travers the complete array
        int max=0;

        for(int right=0;right<arr.length;right++){
            char current=arr[right];

            while (!hs.add(current)){
                hs.remove(arr[left]);
                left++;
            }

            hs.add(current);

            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
