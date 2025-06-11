package HeapPQ;
// finding Kth Largest element in an array with PQ
import java.util.*;

public class KthLargest {

    public static void main(String[] args) {
          int[] arr={1,2,2,3,3,3}; // input array
          int k=2;  // target
                                       // 1->3, 2->2, 3-> 1
        System.out.println(Arrays.toString(kFrequent(arr,k)));

    }

    public static int[] kFrequent(int[] nums,int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer>[] bucket=new List[nums.length+1];

        for(int num: nums){
            hm.put(num,hm.getOrDefault(num,0)+1); // we store the numbers as key and their frequencies as values
        }

        for(int num: hm.keySet()){  // we start storing each element/ keys of the map
            int frequency=hm.get(num);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(num);
        }

        int[] result=new int[k];
        int counter=0;

        for(int pos=bucket.length-1;pos>=0 && counter<k;pos--){
            if(bucket[pos]!=null){
                for(Integer integer: bucket[pos]){
                    result[counter++]=integer;
                }
            }
        }

        return result;
    }


}
