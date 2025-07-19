package graph.Creation;

import java.util.Arrays;

public class AdjacencyMatrixDFS {

    static class Solution {
        public boolean validPath(int n, int[][] edges, int source, int destination) {
            //Adjacency Matrix using DFS

            //Create Adjacency Matrix
            boolean[][] graph= new boolean[n][n];
            //fill all the false value
            for(boolean[] row: graph){
                Arrays.fill(row,false);
            }
            //Store All the value in Adjacency Matrix
            for(int[] edge : edges){
                int u=edge[0], v = edge[1];
                graph[u][v] = true;
                graph[v][u] = true;
            }
            boolean[] vis = new boolean[n];
            return dfs(graph,source, destination, vis, n);
        }

        private boolean dfs(boolean[][] graph,int src, int des, boolean[] vis, int n){

            if(src == des) return true;
            vis[src] = true;

            for(int i=0; i < n; i++){
                if(graph[src][i] == true && !vis[i])
                    if(dfs(graph, i, des, vis, n))
                        return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Sample input
        int n = 6;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {3, 5},
                {5, 4},
                {4, 3}
        };
        int source = 0;
        int destination = 2;

        boolean result = solution.validPath(n, edges, source, destination);
        System.out.println("Is there a valid path from " + source + " to " + destination + "?---> " + result);
    }

}
