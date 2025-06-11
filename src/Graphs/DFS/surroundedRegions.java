package Graphs.DFS;

import java.util.Arrays;

public class surroundedRegions {

    public static void main(String[] args) {

        char[][] board={{'X','X','X','X'},{'X','O','O','X'},{'X','O','O','X'},{'X','X','X','O'}};
        solve(board);

        for(char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void solve(char[][] board){
        if(board==null || board.length==0 || board[0].length==0){
            return;
        }

        // checking for top and bottom row
        for(int j=0;j<board[0].length;j++){
            if(board[0][j]=='O')
                dfs(board,0,j);
            if(board[board.length-1][j]=='O'){
                dfs(board,board.length-1,j);
            }
        }

        // checking for left and right column

        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0);
            }
            if(board[i][board[0].length-1]=='O'){
                dfs(board,i,board.length-1);
            }
        }

        // convert the identified surrounded region to X

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }

    }

    public static void dfs(char[][] board, int i, int j){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!='O'){
            return;
        }

        board[i][j]='#'; // temp character to mark a safe O

        dfs(board,i+1,j); // right
        dfs(board,i-1,j); // left
        dfs(board,i,j+1); //down
        dfs(board,i,j-1); // top

    }

}
