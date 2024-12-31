package HeapPQ;

// Kth largest element in a stream

import java.util.PriorityQueue;

public class Largest {

    PriorityQueue<Integer> pq;
    private int k;

    public Largest(int k,int[] nums){
        this.k=k;
        pq=new PriorityQueue<>();

        for(int num:nums){
            add(num);
        }

    }

    public int add(int val){
        if(pq.size()<k){
            pq.offer(val);
        }else if (val>pq.peek()){
            pq.poll();
            pq.offer(val);
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int k = 3;
        int[] initialElements = {4, 5, 8, 2};
        Largest kthLargest = new Largest(k, initialElements);

        // Print the initial kth largest element
        System.out.println("Initial kth Largest: " + kthLargest.add(0)); // The first call to add after the initialization

        // Adding more elements and printing the kth largest element after each addition
        System.out.println("kth Largest after adding 3: " + kthLargest.add(3));
        System.out.println("kth Largest after adding 9: " + kthLargest.add(9));
        System.out.println("kth Largest after adding 10: " + kthLargest.add(10));
        System.out.println("kth Largest after adding 6: " + kthLargest.add(6));

    }

}
