package InternalWorkings;

import java.util.ArrayList;
import java.util.Stack;

// Implementation of Stacks using ArrayList
public class stacks<T> {

   private ArrayList<T> stack;
   public stacks(){
       stack=new ArrayList<>();
   }


   // PUSH OPERATION

    public void push(T element){
       stack.add(element);
    }

    // POP OPERATION
    public T pop(){
       if(stack.isEmpty()){
           System.out.println("The stack is empty");
       }
       return stack.remove(stack.size()-1);
    }

    // PEEK OPERATION

    public T peek(){
       if(stack.isEmpty()){
           System.out.println("The stack is empty");
       }
       return stack.get(stack.size()-1);
    }

    public boolean isEmpty(){
       return stack.isEmpty();
    }

    public int size(){
       return stack.size();
    }

    public static void main(String[] args) {

            stacks<Integer> stack = new stacks<>();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Top element: " + stack.peek());  // Output: 30
            stack.pop();
            System.out.println("Top element after pop: " + stack.peek());  // Output: 20
            System.out.println("Stack size: " + stack.size());  // Output: 2

    }



}
