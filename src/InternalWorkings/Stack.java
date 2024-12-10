package InternalWorkings;


// Implementation of Stack with Array
public class Stack {

    private int[] arr;  // lets take a very high value
    int index=0;

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());  // Output: 30
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());  // Output: 20
        System.out.println("Stack size: " + stack.size());  // Output: 2
    }

    public Stack(){
        arr=new int[10000];
    }

    public void push(int element){
        arr[index++]=element;
    }

    public int pop(){
        int x=arr[index-1];
        index--;
        return x;
    }

    public int peek(){
        return arr[index-1];
    }

    public boolean isEmpty(){
        if(arr.length==0){
            return true;
        }
        return false;
    }

    public int size(){
        return index;
    }


}
