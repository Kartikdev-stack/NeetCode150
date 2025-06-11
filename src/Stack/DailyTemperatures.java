package Stack;

import java.util.Arrays;
import java.util.Stack;


public class DailyTemperatures {
    public static void main(String[] args) {
         int[] temperatures={30,38,30,36,35,40,28};
         System.out.println(dailyTemperatures(temperatures));
    }

//    // Brute Force Approach
//    public static int[] dailyTemperatures(int[] temperatures){
//
//           int[] result=new int[temperatures.length];
//           Arrays.fill(result,0);
//
//           if(temperatures==null || temperatures.length==0)
//               return result;
//
//           for(int i=0;i<temperatures.length;i++){
//               for (int j=i+1;j<temperatures.length;j++){
//                   if(temperatures[i]<temperatures[j]){
//                       result[i]=j-i;
//                       break;
//                   }
//               }
//           }
//
//           return result;
//    }

      public static int[] dailyTemperatures(int[] temperatures){
          int[] result=new int[temperatures.length];
//           Arrays.fill(result,0);
//
//           if(temperatures==null || temperatures.length==0)
//               return result;

          Stack<Integer> stack=new Stack<>();


          for(int i=0;i<temperatures.length;i++) {
              while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i] ){
                  int pop=stack.pop();
                  result[pop]=i-pop;
              }
              stack.push(i);
          }

          return result;
      }


}
