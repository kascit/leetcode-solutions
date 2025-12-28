/*
Submission: 1852569197
Status: Accepted
Timestamp: 2025-12-11 04:56:41 UTC
Runtime: 324 ms
Memory: 282.8 MB
*/

class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer,TreeSet<Integer>> horz = new HashMap<>();
        Map<Integer,TreeSet<Integer>> vert = new HashMap<>();
        for (int[] building : buildings) {
          int x = building[0];
          int y = building[1];
          if (!horz.containsKey(x)) {
            horz.put(x,new TreeSet<>());
          }
          if (!vert.containsKey(y)) {
            vert.put(y,new TreeSet<>());
          }

          horz.get(x).add(y);
          vert.get(y).add(x);
        }

        // Set<String> ans = new HashSet<>();
        int cnt = 0;

        for (Map.Entry<Integer,TreeSet<Integer>> e : horz.entrySet()) {
          int xi = e.getKey();
          char x = (char) ('0' + xi);
          TreeSet<Integer> cur = e.getValue();
          int first = cur.first();
          int last  = cur.last();

          for (int v : cur) {
              if (v == first || v == last) continue;
              TreeSet<Integer> cury = vert.get(v);
              if (cury.lower(xi) == null || cury.higher(xi) == null) continue;

              char y = (char) ('0' + v);
              // ans.add(x + "/" + y);
              cnt++;
          }
        }
        // for (Map.Entry<Integer,TreeSet<Integer>> e : vert.entrySet()) {
        //   char y = (char) ('0' + e.getKey());
        //   TreeSet<Integer> cur = e.getValue();
        //   int first = cur.first();
        //   int last  = cur.last();

        //   for (int v : cur) {
        //       if (v == first || v == last) continue;
        //       char x = (char) ('0' + v);
        //       ans.add(x + "/" + y);
        //   }
        // } return ans.size();
        return cnt;

    }
}