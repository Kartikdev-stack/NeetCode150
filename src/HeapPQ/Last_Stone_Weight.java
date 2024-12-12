package HeapPQ;

import java.util.PriorityQueue;

public class Last_Stone_Weight {

    public static void main(String[] args) {
        int[] stones={3,2};
        System.out.println(lastStoneWt(stones));
    }

    public static int lastStoneWt(int[] stones){
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int element: stones){
            pq.add(element);
        }

        while(pq.size()!=1) {
            int y = pq.remove();
            int x = pq.remove();

            // if x amd y are not equal or both are equal but the size reduces to 0
            if (x != y || (x==y && pq.size()==0)) {
                pq.add(y - x);
            }


        }




        return pq.peek();
    }

}
