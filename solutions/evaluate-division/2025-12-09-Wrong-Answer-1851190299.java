/*
Submission: 1851190299
Status: Wrong Answer
Timestamp: 2025-12-09 15:04:24 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
  // class Pair {
  //   String node;
  //   Double wt;
  //   Pair(String s, Double wt) {
  //     this.node = s;
  //     this.wt = wt;
  //   }
  // }
  // Map<String,ArrayList<Pair>> adj;
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // adj = new HashMap<>();
        
      Map<String,Integer> mappy = new HashMap<>();
      int idx = 0;
      for (List<String> l : equations) {
        for (String s : l) {
          if (!mappy.containsKey(s)) {
            mappy.put(s, idx++);
        }
        }
      }
      int n = mappy.size();
      double[][] mat = new double[n][n];
      for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            mat[i][j] = -1.0;
      for (int i = 0; i < n; i++) mat[i][i] = 1.0;
      for(int i = 0; i < values.length; i++) {
        String u = equations.get(i).get(0);
        String v = equations.get(i).get(1);
        int ui = mappy.get(u);
        int vi = mappy.get(v);
        Double wt = values[i];

        // mat[ui][ui] = 1;
        // mat[vi][vi] = 1;
        mat[ui][vi] = wt;
        mat[vi][ui] = 1/wt;

        // adj.putIfAbsent(u,new ArrayList<>());
        // adj.get(u).add(new Pair(v,wt));


        // adj.putIfAbsent(v,new ArrayList<>());
        // adj.get(v).add(new Pair(u,1/wt));
      }

      for (int k = 0; k < n; k++) {
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            if (mat[i][k] > 0 && mat[k][j] > 0) {
              mat[i][j] = mat[i][k] * mat[k][j];
            }
          }
        }
      }

      idx = 0;
      double[] ans = new double[queries.size()];
      for (List<String> q : queries) {
        if ( !mappy.containsKey(q.get(0)) || !mappy.containsKey(q.get(1)) ) {
          ans[idx++] = -1;
          continue;
        }
        int a = mappy.get(q.get(0));
        int b = mappy.get(q.get(1));
        ans[idx++] = (mat[a][b] > 0 ? mat[a][b] : -1.0);


        // if (!adj.containsKey(q.get(0)) || !adj.containsKey(q.get(1))) {ans[idx++] = -1; continue;}
        // boolean[] vis = new boolean[queries.size()];
        // double cur = dfs(q.get(0),q.get(1),new HashMap<>(),1);
        // if (cur == 0) cur = -1;
        // ans[idx++] = cur;
      }
        return ans;
    }

    // double dfs(String source, String destination, Map<String,Boolean> visited, double path) {
    //   if (source.equals(destination)) return path;
    //   if (visited.getOrDefault(source,false)) return 0;
    //   ArrayList<Pair> lp = adj.get(source);
    //   visited.put(source,true);
    //   for (Pair p : lp) {
    //     String neww = p.node;
    //     double ww = p.wt;
    //     double poss = dfs(neww,destination,visited,path*ww);
    //     if (poss != 0) return poss;
    //     // visited[]
    //   }
    //   // visited.put(source,false);
    //   return 0;
    // }
}