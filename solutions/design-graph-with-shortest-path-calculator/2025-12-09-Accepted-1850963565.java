/*
Submission: 1850963565
Status: Accepted
Timestamp: 2025-12-09 09:52:51 UTC
Runtime: 227 ms
Memory: 65.7 MB
*/

class Graph {
  ArrayList<ArrayList<int[]>> adj;
  int cnt;

  class QueueNode {
    public int currNode;
    public int currDistance;

    QueueNode(int currNode, int currDistance) {
      this.currNode = currNode;
      this.currDistance = currDistance;
    }
  }

  public Graph(int n, int[][] edges) {
    this.cnt = n;
    this.adj = new ArrayList<ArrayList<int[]>>();
    for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<>());
    }
    for (int[] edge : edges) {
      addEdge(edge);
    }
  }

  public void addEdge(int[] edge) {
    while (edge[0] >= this.cnt || edge[1] >= this.cnt) {
      adj.add(new ArrayList<>());
    }
    adj.get(edge[0]).add(new int[] { edge[1], edge[2] });
  }

  public int shortestPath(int src, int dest) {
        int[] dist = new int[this.cnt];
        for (int i = 0; i < this.cnt; i++) dist[i] = Integer.MAX_VALUE;
        dist[src] = 0;
        
        PriorityQueue<QueueNode> q = new PriorityQueue<>((q1, q2) -> {
            return Integer.compare(q1.currDistance, q2.currDistance);
        });
        
        q.add(new QueueNode(src, 0));
        
        while (q.size() != 0) {
      
            QueueNode qNode = q.poll();
                   
            int curNode  = qNode.currNode;
            int curDist = qNode.currDistance;
            for (int[] nbr : adj.get(curNode)) {
              int nbrNode = nbr[0];
              int nbrDist = nbr[1];
              if (dist[curNode] + nbrDist < dist[nbrNode]) {
                dist[nbrNode] = dist[curNode] + nbrDist;
                q.offer(new QueueNode(nbrNode,dist[nbrNode] ));
              }
            }
        }
        return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
