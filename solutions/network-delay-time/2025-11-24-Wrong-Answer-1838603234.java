/*
Submission: 1838603234
Status: Wrong Answer
Timestamp: 2025-11-24 14:59:27 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    class QueueNode {
        public int currNode;
        public int currDistance;
        
        QueueNode(int currNode , int currDistance) {
            this.currNode = currNode;
            this.currDistance = currDistance;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {

        int[][] adj = new int[n+1][n+1];

        for (int[] t : times) {
            int u = t[0], v = t[1], w = t[2];
            adj[u][v] = w;
        }

        Integer[] shortestDistances = new Integer[n+1];
            
        PriorityQueue<QueueNode> q = new PriorityQueue<>((q1, q2) -> {
            return Integer.compare(q1.currDistance, q2.currDistance);
        });
        
        q.add(new QueueNode(k, 0));
        
        while (q.size() != 0) {
            
            QueueNode qNode = q.poll();
            
            if (shortestDistances[qNode.currNode] == null || shortestDistances[qNode.currNode] > qNode.currDistance) {
                shortestDistances[qNode.currNode] = qNode.currDistance;
            } else {
                continue;
            }
            
            int newNode  = qNode.currNode;
            
            for (int i = 1; i <= n; i++) {
                if (newNode != i && adj[newNode][i] != 0) {
                    q.add(new QueueNode(i, adj[newNode][i] + qNode.currDistance));
                }
            }
        }
        shortestDistances[0] = 0;
        int ans = 0;
        for (Integer i : shortestDistances) {
            if (i==null) return -1;
            if (i > ans) ans = i;
        } return ans;
    }
}