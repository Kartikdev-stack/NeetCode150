package TwoPointers;

public class validPallindrome {
    public static void main(String[] args) {
          String s="0P";
        System.out.println(validPallindrome(s));
    }

    public static boolean validPallindrome(String s){

        if(s.isEmpty() || s.length()==1){
            return true;
        }


        int left=0;
        int right=s.length()-1;

        while(left<right){



            // first we deal with skipping alphanumeric character by checking left
            while(left<right && !isAlphaNumeric(s.charAt(left))){
                left++;
            }

            // now we deal with skipping alphanumeric character by checking right

            while(left<right && !isAlphaNumeric(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }


            left++;
            right--;

        }
        return true;
    }


    public static boolean isAlphaNumeric(Character c){
            if((c>='A' && c<='Z') || ((c>='a' && c<='z')) || (c>='0' && c<='9')){
                return true;
            }
            return false;
    }

}
