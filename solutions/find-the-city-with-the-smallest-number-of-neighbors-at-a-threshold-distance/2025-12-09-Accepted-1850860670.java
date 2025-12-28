/*
Submission: 1850860670
Status: Accepted
Timestamp: 2025-12-09 07:34:21 UTC
Runtime: 14 ms
Memory: 46.7 MB
*/

class Solution {
  public int findTheCity(int n, int[][] edges, int distanceThreshold) {
    int inf = 10001;
    int[][] dist = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          continue;
        }  
        dist[i][j] = inf;
      }
    }

    for (int i = 0; i < edges.length; i++) {
      for (int j = 0; j < edges[0].length; j++) {
        dist[edges[i][0]][edges[i][1]] = edges[i][2];
        dist[edges[i][1]][edges[i][0]] = edges[i][2];
      }
    }

    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (dist[i][k] != inf && dist[k][j] != inf && dist[i][k] + dist[k][j] < dist[i][j]) {
            dist[i][j] = dist[i][k] + dist[k][j];

          }
        }
      }
    }

    TreeMap<Integer, Integer> hp = new TreeMap<>();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (dist[i][j] <= distanceThreshold) {
          hp.put(i, hp.getOrDefault(i, 0) + 1);
        }
      }
    }

    int ans = 0;
    int val = Integer.MAX_VALUE;
    for (var i : hp.entrySet()) {
      // System.out.println(i.getKey() + " has: " + i.getValue());
      if (i.getValue() <= val) {
        val = i.getValue();
        ans = i.getKey();
      }
    }
    return ans;
  }
}