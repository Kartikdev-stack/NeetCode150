package Graphs.DFS;

public class MaxArea {

    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {0, 1, 1, 0, 1},
                {0, 1, 0, 0, 1}
        };

        int maxArea = maxArea(grid);
        System.out.println("Max Area: " + maxArea);
    }

    static int count;

    public static int maxArea(int[][] grid){
        int maxArea=0;
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
//                    count=0;
//                    maxArea=Math.max(maxArea,dfs(grid,i,j));  // at each valid cell where we discover a one we can do a dfs to see how many 1s are connected
                    dfs(grid,i, j);
                    maxArea=Math.max(maxArea,count);
                    count=0;
                }
            }
        }

        return maxArea;
    }


    public static void dfs(int[][] grid, int i, int j){

        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0)
            return ;

        grid[i][j]=0; // the cell is visited
        count++;

        dfs(grid,i+1,j);
        dfs(grid, i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }






}
