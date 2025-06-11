package practise;

import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {
        int[] stones={1,2};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);  // Defining a max heap

        // Insert all elements one by one in the heap so we get the largest first

        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }

        while(pq.size()>1){
            int y=pq.remove(); // getting the first largest
            int x=pq.remove(); // getting the second largest


            // Comparing
            if(x<y){
                pq.add(y-x); // Adding the new weight if a difference exists
            }
        }

        if(pq.size()==1){
            return pq.peek();
        }

        return 0;
    }

}
