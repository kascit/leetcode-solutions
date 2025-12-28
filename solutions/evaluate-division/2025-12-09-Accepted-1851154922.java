/*
Submission: 1851154922
Status: Accepted
Timestamp: 2025-12-09 14:22:11 UTC
Runtime: 1 ms
Memory: 47 MB
*/

class Solution {
  class Pair {
    String node;
    Double wt;
    Pair(String s, Double wt) {
      this.node = s;
      this.wt = wt;
    }
  }
  Map<String,ArrayList<Pair>> adj;
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        adj = new HashMap<>();
        
      // Map<String,Integer> mappy = new HashMap<>();
      // for ()
      for(int i = 0; i < values.length; i++) {
        String u = equations.get(i).get(0);
        String v = equations.get(i).get(1);
        Double wt = values[i];

        adj.putIfAbsent(u,new ArrayList<>());
        adj.get(u).add(new Pair(v,wt));


        adj.putIfAbsent(v,new ArrayList<>());
        adj.get(v).add(new Pair(u,1/wt));
      }

      int idx = 0;
      double[] ans = new double[queries.size()];
      for (List<String> q : queries) {
        if (!adj.containsKey(q.get(0)) || !adj.containsKey(q.get(1))) {ans[idx++] = -1; continue;}
        // boolean[] vis = new boolean[queries.size()];
        double cur = dfs(q.get(0),q.get(1),new HashMap<>(),1);
        if (cur == 0) cur = -1;
        ans[idx++] = cur;
      }
        return ans;
    }

    double dfs(String source, String destination, Map<String,Boolean> visited, double path) {
      if (source.equals(destination)) return path;
      if (visited.getOrDefault(source,false)) return 0;
      ArrayList<Pair> lp = adj.get(source);
      visited.put(source,true);
      for (Pair p : lp) {
        String neww = p.node;
        double ww = p.wt;
        double poss = dfs(neww,destination,visited,path*ww);
        if (poss != 0) return poss;
        // visited[]
      }
      // visited.put(source,false);
      return 0;
    }
}