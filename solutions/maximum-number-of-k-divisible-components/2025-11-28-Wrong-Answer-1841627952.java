/*
Submission: 1841627952
Status: Wrong Answer
Timestamp: 2025-11-28 08:40:23 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    int ans = 0;
    int[] v;
    int k;
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        this.k = k;
        this.v = values;
        ArrayList<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        posty(adj, 0, -1);
        return ans;
    }

    int posty(ArrayList<Integer>[] adj, int cur, int parent) {
        // boolean vis = false;
        int sum = v[cur];
        // System.out.println("Current: " + cur + " Value: " + sum);
        for (int child : adj[cur]) {
            if (child == parent)
                continue;
            // vis = true;
            sum += posty(adj, child, cur);
        }
        // System.out.println("Current: " + cur + " After Child Value: " + sum);
        // if (!vis) return sum;
        if (sum % k == 0) {
            ans++;
            return 0;
        } return sum;
    }
}