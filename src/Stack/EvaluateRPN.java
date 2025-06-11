package Stack;


import java.util.Stack;

//Evaluate Reverse Polish Notation
public class EvaluateRPN {

    public static void main(String[] args) {
        String[] tokens={"1","2","+","3","*","4","-"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens){

        Stack<Integer> stack=new Stack<>();

        for(String c: tokens){
            if(c.equals("+")){
                int a=stack.pop();
                int b=stack.pop();

                stack.push(a+b);
            }else if(c.equals("-")){
                int a=stack.pop();
                int b=stack.pop();

                stack.push(b-a);
            }else if(c.equals("*")){
                int a=stack.pop();
                int b=stack.pop();

                stack.push(a*b);
            }else if (c.equals("/")){
                int a=stack.pop();
                int b=stack.pop();

                stack.push(b/a);
            }else {
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }



}
