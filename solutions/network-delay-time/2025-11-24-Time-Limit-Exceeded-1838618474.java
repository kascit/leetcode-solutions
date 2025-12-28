/*
Submission: 1838618474
Status: Time Limit Exceeded
Timestamp: 2025-11-24 15:19:09 UTC
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
        for (int i = (int) -1e8; i < (int) 1e8;i++);
        Integer[][] adj = new Integer[n+1][n+1];

        for (int[] t : times) {
            int u = t[0], v = t[1], w = t[2];
            if (adj[u][v] == null || adj[u][v] > w) adj[u][v] = w;
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
                if (newNode != i && adj[newNode][i] != null) {
                    q.add(new QueueNode(i, adj[newNode][i] + qNode.currDistance));
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (shortestDistances[i] == null) return -1;
            ans = Math.max(ans, shortestDistances[i]);
        } return ans;
    }
}