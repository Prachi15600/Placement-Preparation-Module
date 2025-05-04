class Solution {
    public boolean dfs(int node, int clr, int[] color, int[][] graph) {
        color[node] = clr;

        for(int it : graph[node]) {
            if(color[it] == -1) {
                if(dfs(it, 1-clr, color, graph) == false) return false;
            }
            else if(color[it] == clr) return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        int[] color = new int[v];

        for(int i=0; i<v; i++) {
            color[i] = -1;
        }

        for(int i=0; i<v; i++) {
            if(color[i] == -1) {
                if(dfs(i, 0, color, graph)==false) return false;
            }
        }
        return true;
    }
}