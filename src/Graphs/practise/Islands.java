package Graphs.practise;

public class Islands {
    public static void main(String[] args) {
        char[][] grid={{'1','1','1','0','1'},
                      {'1','1','0','1','1'},
                      {'0','0','1','0','0'},
                      {'0','0','0','1','1'}
                      };

        int no_of_islands=numIslands(grid);

        System.out.println(no_of_islands);
    }

    public static int numIslands(char[][] grid){
        // Null check for grid

        if(grid.length==0 || grid[0].length==0 || grid==null){
            return 0;
        }

        int count=0;

        // initiate the traversal of the grid

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

    public static void dfs(char[][] grid, int i, int j){
         // Check boundary constraints

        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0'){
            return;
        }

        grid[i][j]='0'; // mark the coordinate as visited

        dfs(grid,i+1,j); // exploring the bottom
        dfs(grid,i-1,j); // exploring the top
        dfs(grid,i,j+1); // exploring the right
        dfs(grid,i,j-1); // exploring the left

    }



}
