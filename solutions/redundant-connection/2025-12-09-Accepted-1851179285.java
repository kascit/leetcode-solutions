/*
Submission: 1851179285
Status: Accepted
Timestamp: 2025-12-09 14:51:15 UTC
Runtime: 1 ms
Memory: 44.6 MB
*/

class Solution {

    class DSU {
        int parent[];
        int size[];
        int N;

        DSU(int N) {
            this.N = N;
            this.parent = new int[N];
            this.size = new int[N];

            for (int i = 0; i < N; i++) {
                size[i] = 1;
                parent[i] = i;
            }
        }

        public int findParent(int node) {
            if (parent[node] == node) {
                return node;
            }
            int masterParent = findParent(parent[node]);
            parent[node] = masterParent; // compression
            return masterParent;
        }


        public boolean union(int node1, int node2) {
            int masterParentOfNode1 = findParent(node1);
            int masterParentOfNode2 = findParent(node2);

            if (masterParentOfNode1 == masterParentOfNode2) {
                return true;
            }

            if (size[masterParentOfNode1] >= size[masterParentOfNode2]) {
                size[masterParentOfNode1] += size[masterParentOfNode2];
                parent[masterParentOfNode2] = masterParentOfNode1;
            } else {
                size[masterParentOfNode2] += size[masterParentOfNode1];
                parent[masterParentOfNode1] = masterParentOfNode2;
            }
            
            return false;
        }


    }

    public int[] findRedundantConnection(int[][] edges) {
        DSU dsu = new DSU(edges.length);

        for (int[] edge : edges) {
            int node1 = edge[0] - 1;
            int node2 = edge[1] - 1;

            if (dsu.union(node1, node2)) {
                return edge;
            }
        }

        return new int[2];
    }
}