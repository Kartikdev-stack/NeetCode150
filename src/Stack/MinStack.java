package Stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val){
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }

    public void pop(){
        if(stack.isEmpty())
            return;
        int top = stack.pop();
        if(top == minStack.peek()){
            minStack.pop();
        }
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack min = new MinStack();
        min.push(2);
        min.push(1);
        min.push(0);

        System.out.println("Top: " + min.top());      // Output: 0
        System.out.println("Min: " + min.getMin());   // Output: 0

        min.pop(); // Pops 0

        System.out.println("Top after pop: " + min.top());     // Output: 2
        System.out.println("Min after pop: " + min.getMin());  // Output: 1

        min.pop(); // Pops 0

        System.out.println("Top after pop: " + min.top());     // Output: 2
        System.out.println("Min after pop: " + min.getMin());  // Output: 1

    }
}
