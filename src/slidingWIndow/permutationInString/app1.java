package slidingWIndow.permutationInString;

import java.util.Arrays;

// Brute Force
public class app1 {
    public static void main(String[] args) {
        System.out.println(permutationInString("abc","cbqdcba"));
    }

    public static boolean permutationInString(String s1, String s2){
        if(s1.length()>s2.length()){
            return false;
        }
        //cbadefg
        // we generate subStrings of s2 with same length as s1



        char[] arr1=s1.toCharArray();
        Arrays.sort(arr1);
        String s1_sorted=new String(arr1);

        for(int i=0;i<=s2.length() - s1.length();i++){
            String ss=s2.substring(i,i+s1.length());
            char[] arr=ss.toCharArray();
            Arrays.sort(arr);
            ss=new String(arr);  // s2 is sorted here


            if(ss.compareTo(s1_sorted)==0){
                return true;
            }

        }
      return false;
    }

}
