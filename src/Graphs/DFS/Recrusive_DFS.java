package Graphs.DFS;


import java.util.LinkedList;

// Depth First Search using Recursive Approch
public class Recrusive_DFS {

    public static void main(String[] args) {
        GraphDFSRecursive g = new GraphDFSRecursive(6);

        // Creating a graph with 6 vertices (0-5)
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.println("Depth First Traversal (Recursive) starting from vertex 0:");
        g.DFS(0);
    }

    public static class GraphDFSRecursive{
        private int V;
        private LinkedList<Integer>[] adj;

        @SuppressWarnings("unchecked")
        GraphDFSRecursive(int v){
            V=v;
            adj=new LinkedList[v];
            for(int i=0;i<v;i++){
                adj[i]=new LinkedList<>();
            }
        }

        void addEdge(int v, int w){
            adj[v].add(w);
        }

        void DFSRecursive(int v, boolean[] visited){
            visited[v]=true;
            System.out.println(v+" ");

            for(Integer neighbor: adj[v]){
                if(!visited[neighbor]){
                    DFSRecursive(neighbor,visited);
                }
            }
        }

        void DFS(int start){
            boolean[] visited=new boolean[V];

            DFSRecursive(start,visited);
        }


    }

}
