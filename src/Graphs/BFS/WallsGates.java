package Graphs.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class WallsGates {

    public void wallsAndGates(int[][] rooms){
        if(rooms==null || rooms.length==0 || rooms[0].length==0){
            return;  // since it is a provided m and n is provided to be >0
        }

        Queue<Pair> q=new LinkedList<>();

        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[0].length;j++){
                if(rooms[i][j]==0){
                    q.offer(new Pair(i,j));  // add all gates to the queue initially so we can check how far is each cell
                }
            }
        }

        if(q.isEmpty())
            return;   // means that no gate was identified

        while(!q.isEmpty()){
              int size= q.size();


              for(int i=0;i<size;i++){
                  Pair p=q.poll();
                  int row=p.x;
                  int col=p.y;

                 //Checking up
                 if(row-1>=0 && rooms[row-1][col]==Integer.MAX_VALUE){
                     rooms[row-1][col]=rooms[row][col]+1;
                     q.offer(new Pair(row-1,col));
                 }

                 // Checking down
                 if(row+1<rooms.length && rooms[row+1][col]==Integer.MAX_VALUE) {
                      rooms[row+1][col]=rooms[row][col]+1;
                      q.offer(new Pair(row + 1, col));
                 }

                 // Checking left
                 if(col-1>=0 && rooms[row][col-1]==Integer.MAX_VALUE){
                      rooms[row][col-1]=rooms[row][col]+1;
                      q.offer(new Pair(row,col-1));
                 }

                 // Checking right
                 if(col+1<rooms[0].length && rooms[row][col+1]==Integer.MAX_VALUE){
                      rooms[row][col+1]=rooms[row][col]+1;
                      q.offer(new Pair(row,col+1));
                 }


              }
        }


    }

    public static class Pair{
        int x;
        int y;

        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    public static void main(String[] args) {
           int INF=Integer.MAX_VALUE;
           int[][] rooms = {
                {INF, -1, 0, INF},
                {INF, INF, INF, -1},
                {INF, -1, INF, -1},
                {0, -1, INF, INF}
           };

        System.out.println("Original Grid: ");
        printGrid(rooms);

        WallsGates solution=new WallsGates();
        solution.wallsAndGates(rooms);

        System.out.println("Grid after processing: ");
        printGrid(rooms);
    }

    private static void printGrid(int[][] grid){
        for(int[] row: grid){
            for(int cell: row){
                if(cell==Integer.MAX_VALUE){
                    System.out.print("INF\t");
                }else {
                    System.out.print(cell+"\t");
                }
            }
            System.out.println();
        }
    }
}
