class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        boolean vis[] = new boolean[v];
        int count = 0;
        for(int i=0; i<v; i++) {
            if(!vis[i]) {
                dfs(i, vis, isConnected);
                count++;
            }
        }
        
        return count;
    }

    public void dfs(int node, boolean vis[], int[][] isConnected) {
        vis[node] = true;

        for(int i=0; i<isConnected.length; i++) {
            if(vis[i] == false && isConnected[node][i] == 1) {
                dfs(i, vis, isConnected);
            }
        }
    }
}