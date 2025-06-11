package ArraysHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class KFrequent {

    public static void main(String[] args) {
         int[] nums={1,2,2,3,3,3};
        System.out.println(Arrays.toString(topKfrequent(nums,2)));

    }

    public static int[] topKfrequent(int[] nums, int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->hm.get(a)-hm.get(b));

       for(int num: nums){
           hm.put(num,hm.getOrDefault(num,hm.getOrDefault(num,0)+1));
       }

       for(int num: hm.keySet()){
           pq.offer(num);
           if(pq.size()>k){
               pq.poll();
           }
       }

       int[] result=new int[k];
       for(int i=0;i<k;i++){
           result[i]=pq.poll();
       }

        return result;
    }


}
