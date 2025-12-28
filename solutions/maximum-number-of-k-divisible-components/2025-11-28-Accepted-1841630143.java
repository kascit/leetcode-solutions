/*
Submission: 1841630143
Status: Accepted
Timestamp: 2025-11-28 08:44:51 UTC
Runtime: 20 ms
Memory: 91.8 MB
*/

class Solution {
    int ans = 0;
    int[] v;
    int k;
    ArrayList<Integer>[] adj;

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        this.k = k;
        this.v = values;
        this.adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        posty(0, -1);
        return ans;
    }

    long posty(int cur, int parent) {
        long sum = v[cur];

        for (int child : adj[cur]) {
            if (child == parent)
                continue;
            sum += posty(child, cur);
        }

        if (sum % k == 0) {
            ans++;
            return 0;
        }
        return sum;
    }
}

/**

        // boolean vis = false;
        // System.out.println("Current: " + cur + " Value: " + sum);
            // vis = true;
        // System.out.println("Current: " + cur + " After Child Value: " + sum);
        // if (!vis) return sum;
 */