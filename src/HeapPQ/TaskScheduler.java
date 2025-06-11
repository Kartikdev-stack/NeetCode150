package HeapPQ;

// Brute Force Solution using Greedy Approach


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TaskScheduler {

    public int leastInterval(char[] tasks, int n){

        // Getting frequency of each task ( since its represented by a alphabet )
        int[] count=new int[26];
        for(char task : tasks){
            count[task - 'A']++; // logging frequencies of each task
        }

        List<int[]> arr=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(count[i] > 0 ){
                arr.add(new int[]{count[i],i}); // basically we push all the tasks that are in the input into the array
            }
        }

        int time=0; // initially time would be zero

        List<Integer> processed = new ArrayList<>();
        while(!arr.isEmpty()){
            int maxi=-1;
            for(int i=0;i<arr.size();i++){
                boolean ok=true;
                for(int j=Math.max(0,time-n);j<time;j++){
                    if(j<processed.size() && processed.get(j)==arr.get(i)[1]){
                        ok=false;
                        break;
                    }
                }
                if(!ok) continue;
                if(maxi==-1 || arr.get(maxi)[0] < arr.get(i)[0]){
                    maxi=i;
                }
            }

            time++;
            int curr=-1;
            if(maxi!=-1){
                curr=arr.get(maxi)[1];
                arr.get(maxi)[0]--;
                if(arr.get(maxi)[0]==0){
                    arr.remove(maxi);
                }
            }
            processed.add(curr);
        }
        return time;
    }


    public static void main(String[] args) {

    }

}
