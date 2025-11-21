/*
 * Submission: 1834036040
 * Problem: Number of Provinces (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 08:28:58 UTC
 * Runtime: 3 ms
 * Memory: 47.2 MB
 */

class Solution {
    int[][] adj;
    int n;
    public int findCircleNum(int[][] isConnected) {
        this.adj = isConnected;
        this.n = adj.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (adj[i][i] == 1) {
                adj[i][i] = 0;
                consume(i);
                ans++;
            }
            
        } return ans;
    }

    void consume(int i) {
        for (int edgeTo = 0; edgeTo < n; edgeTo++) {
            if(adj[i][edgeTo] == 1) {
                adj[i][edgeTo] = 0;
                adj[edgeTo][i] = 0;
                if (i != edgeTo) consume(edgeTo);
            }
        }
    }
}