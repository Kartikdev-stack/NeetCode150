package Graphs.DFS;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

// Iteratice Implementation of Depth First Search Algorithm in Java
public class Iterative_DFS {

    public static void main(String[] args) {
        GraphDFSIterative g = new GraphDFSIterative(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.println("DFS Transversal from verteks 0:");
        g.DFSIterative(0);
    }


    public static class GraphDFSIterative{
        private int V; //Number of vertices
        private LinkedList<Integer> adj[]; // Adjacency list ( basically each indeks in the array is a empty linkedlist  )

        @SuppressWarnings("unchecked")
        GraphDFSIterative(int v){
            V=v;
            adj=new LinkedList[v];
            for(int i=0;i<v;i++){
                adj[i]=new LinkedList<>();
            }
        }

        void addEdge(int v, int w){
            adj[v].add(w);
        }

        void DFSIterative(int start){
            boolean[] visited=new boolean[V];

            Stack<Integer> stack=new Stack<>();

            stack.push(start);

            while(!stack.isEmpty()){
                int vertex=stack.pop();

                if(visited[vertex])
                    continue;

                visited[vertex]=true;
                System.out.println(vertex+ " ");


                ListIterator<Integer> it=adj[vertex].listIterator(adj[vertex].size());
                while(it.hasPrevious()){
                    int neighbor=it.previous();
                    if(!visited[neighbor])
                        stack.push(neighbor);
                }
            }
        }


    }


}
