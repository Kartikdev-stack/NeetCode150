package easy;

import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
           String s="]]";
        System.out.println(reverseString(s));
    }


    public static boolean reverseString(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){

            char c=s.charAt(i);
            if( (c=='{') || (c=='(') || (c=='[')){
                stack.push(c);
            }else {

                if(stack.isEmpty()){
                    return false;
                }

                if ((c == '}' && stack.peek() == '{') || (c == ')' && stack.peek() == '(') || (c == ']' && stack.peek() == '[')) {
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }

        return false;

    }
}
