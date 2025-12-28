/*
Submission: 1852559030
Status: Wrong Answer
Timestamp: 2025-12-11 04:43:01 UTC
Runtime: N/A
Memory: N/A
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

        Set<String> ans = new HashSet<>();

        for (Map.Entry<Integer,TreeSet<Integer>> e : horz.entrySet()) {
          char x = (char) ('0' + e.getKey());
          TreeSet<Integer> cur = e.getValue();
          int first = cur.first();
          int last  = cur.last();

          for (int v : cur) {
              if (v == first || v == last) continue;
              char y = (char) ('0' + v);
              ans.add(x + "/" + y);
          }
        }
        for (Map.Entry<Integer,TreeSet<Integer>> e : vert.entrySet()) {
          char y = (char) ('0' + e.getKey());
          TreeSet<Integer> cur = e.getValue();
          int first = cur.first();
          int last  = cur.last();

          for (int v : cur) {
              if (v == first || v == last) continue;
              char x = (char) ('0' + v);
              ans.add(x + "/" + y);
          }
        } return ans.size();

    }
}