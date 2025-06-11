package Graphs.DFS;

import java.util.Arrays;

// Flood Fill using DFS approach
public class FloodFill {

    public static void main(String[] args) {
         int[][] image={{0,0,0},{0,0,0}};
         int[][] updated_image=floodFill(image,0,0,0);

         for(int[] row: updated_image){
             System.out.println(Arrays.toString(row));
         }

    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color){
        // Check for null conditions

        if(image==null || image.length==0 ){
            return null;
        }



        // Initiate the transversal

        int value=image[sr][sc]; // represents the number we intend to change


        if(value == color) {
            return image;
        }

        dfs(image,sr,sc,color,value); // calling the dfs function

        return image;
    }

    public static void dfs(int[][] image,int sr, int sc, int color, int value){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=value){
            return;
        }

        image[sr][sc]=color; // since boundary conditions and color conditions are not violated, we change the color to new color

        // now lets explore the neighbors

        dfs(image,sr+1,sc,color,value); // down
        dfs(image,sr-1,sc,color,value); // up
        dfs(image,sr,sc+1,color,value); // right
        dfs(image,sr,sc-1,color,value); // left


    }




}
