package Graphs.DFS;


//  Using DFS Approach
public class NumberofIslands {

    public static void main(String[] args) {
        char[][] grid = {
                {'0', '1', '1', '1', '0'},
                {'0', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '1'}
        };

        int numIslands = numIslands(grid);
        System.out.println("Number of islands: " + numIslands);
    }

    public static int numIslands(char[][] grid) {
          if(grid==null || grid.length==0 || grid[0].length==0)
              return 0;


          int count=0; // count of number of islands


          for(int i=0;i<grid.length;i++){
              for(int j=0;j<grid[0].length;j++){
                  if(grid[i][j]=='1'){
                      dfs(grid,i,j);
                      count++;
                  }
              }
          }
        return count;
    }

    public static void dfs(char[][] grid,int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>= grid[0].length || grid[i][j] == '0'){
            return;
        }

        // reaching this step means we are visiting the cell

        grid[i][j]='0';

        // Since this is a DFS approach, we visit all the 4 sides

        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid, i, j-1);


    }


}
