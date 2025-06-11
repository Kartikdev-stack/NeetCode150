package practise;

public class ContainerMostWater {
    public static void main(String[] args) {
          int[] heights={2,2,2};
          System.out.println(maxArea(heights));
    }

    public static int maxArea(int[] heights){

        // Defining the two pointers

        int start=0;
        int end=heights.length-1;
        int max=0;
        int area=0;

        while(start<end){


            if (heights[start]<heights[end]){
                area=heights[start] * (end-start);
                start++;
            }else {
//                System.out.println(heights[start] - heights[end]);
                area=heights[end] * (end-start);
                end--;
            }

            max=Math.max(max,area);

        }

        return max;
    }

}
