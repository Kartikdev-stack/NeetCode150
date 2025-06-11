package HeapPQ;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPoints {

    public static int[][] kClosest(int[][] points, int k){
        // Result is a 2D array consisting of k elements
        int[][] res=new int[k][2];

        PriorityQueue<int[]> pq=new PriorityQueue<>( (x,y) -> ( x[0]*x[0] + x[1]*x[1] ) - ( y[0]*y[0] + y[1] * y[1]) );  // Comparsion based on Euclid disstance

        for(int[] p : points ){
            pq.add(p); // adding the coordinates one by one in the min-heap
        }

        for(int i=0;i<k;i++){
              res[i]=pq.remove();
        }

        return res;
    }


    public static void main(String[] args) {
            int[][] points={{0,2},{2,0},{2,2}};
            int[][] result=kClosest(points,2);
            System.out.println(Arrays.deepToString(result));
    }

}

