package Graphs.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlantic {

    private int rows;
    private int cols;

    private List<List<Integer>> pacificAtlantic(int[][] heights){
        List<List<Integer>> result=new ArrayList<>();
        if(heights==null || heights.length==0 || heights[0].length==0)
            return result;

        rows=heights.length;
        cols=heights[0].length;


        // Initialising two boolean matrices

        boolean[][] canReachPacific = new boolean[rows][cols];
        boolean[][] canReachAtlantic=new boolean[rows][cols];

        // DFS from Pacific borders

        for(int col=0;col<cols;col++){
            dfs(heights,0,col,canReachPacific);  //  top row
        }

        for(int row=0;row<rows;row++){
            dfs(heights,row,0,canReachPacific);  // top column
        }

        // DFS from Atlantic Borders

        for(int col=0;col<cols;col++){
            dfs(heights,rows-1,col,canReachAtlantic);  // bottom row
        }

        for(int row=0;row<rows;row++){
            dfs(heights,row,cols-1,canReachAtlantic); // Right column
        }


        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if(canReachPacific[row][col] && canReachAtlantic[row][col]){
                    result.add(Arrays.asList(row,col));
                }
            }
        }

        return result;
    }

    private void dfs(int[][] heights,int row, int col, boolean[][] visited){
        visited[row][col]=true;

        if(isValid(row-1,col) && !visited[row-1][col] && heights[row-1][col]>=heights[row][col]) {

            dfs(heights,row-1,col,visited);
        }

        // Check right
        if (isValid(row, col + 1) && !visited[row][col + 1] &&
                heights[row][col + 1] >= heights[row][col]) {
            dfs(heights, row, col + 1, visited);
        }

        // Check down
        if (isValid(row + 1, col) && !visited[row + 1][col] &&
                heights[row + 1][col] >= heights[row][col]) {
            dfs(heights, row + 1, col, visited);
        }

        // Check left
        if (isValid(row, col - 1) && !visited[row][col - 1] &&
                heights[row][col - 1] >= heights[row][col]) {
            dfs(heights, row, col - 1, visited);
        }
    }

    private boolean isValid(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }



    public static void main(String[] args) {
        int[][] heights = {
                {4, 2, 7, 3, 4},
                {7, 4, 6, 4, 7},
                {6, 3, 5, 3, 6}
        };

        PacificAtlantic solution = new PacificAtlantic();
        List<List<Integer>> result = solution.pacificAtlantic(heights);

        System.out.println("Cells that can flow to both oceans:");
        for (List<Integer> cell : result) {
            System.out.println("(" + cell.get(0) + ", " + cell.get(1) + ")");
        }
    }




}
