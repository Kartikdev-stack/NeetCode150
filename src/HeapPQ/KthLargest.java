package HeapPQ;
// finding Kth Largest element in an array with PQ
import java.util.PriorityQueue;

public class KthLargest {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b)-> b-a);  //max-heap implementation
        for(int num: nums){
            pq.offer(num);
        }

        for(int i=0;i<k-1;i++){
            pq.poll();
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums={2,3,1,1,5,5,4};
        System.out.println(findKthLargest(nums,4));
    }

}
