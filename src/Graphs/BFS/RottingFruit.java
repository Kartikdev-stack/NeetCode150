package Graphs.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class RottingFruit {

    public static void main(String[] args) {
        int[][] grid = {
                {2,1,2},
                {1,0,1},
                {0,1,1}
        };

        int maxArea = rottingFruit(grid);
        System.out.println("Time Taken: " + maxArea);
    }

    public static class Pair{
        int x;
        int y;

        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }


    public static int rottingFruit(int[][] grid){
        Queue<Pair> q=new LinkedList<>();
        int total=0;  // total orange count
        int rotten=0; // rotten orange count
        int time=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 || grid[i][j]==2)
                    total++;
                if(grid[i][j]==2)
                    q.offer(new Pair(i,j));
            }
        }


        if(total==0)   // if total count of oranges is 0
            return 0;

        while (!q.isEmpty()){
            int size=q.size();
            rotten+=size;
            if(rotten==total)
                return time;

            time++;

            for(int i=0;i<size;i++){
                Pair p=q.peek();

                if(p.x+1<grid.length && grid[p.x+1][p.y]==1){  // exploring right
                    grid[p.x+1][p.y]=2;
                    q.offer(new Pair(p.x+1,p.y));
                }

                if(p.x-1>=0 && grid[p.x-1][p.y]==1){
                    grid[p.x-1][p.y]=2;
                    q.offer(new Pair(p.x-1,p.y));
                }

                if(p.y+1<grid[0].length && grid[p.x][p.y+1]==1){
                    grid[p.x][p.y+1]=2;
                    q.offer(new Pair(p.x,p.y+1));
                }

                if(p.y-1>=0 && grid[p.x][p.y-1]==1){
                    grid[p.x][p.y-1]=2;
                    q.offer(new Pair(p.x,p.y-1));
                }
                q.poll();

            }

        }
        return -1;
    }


}
