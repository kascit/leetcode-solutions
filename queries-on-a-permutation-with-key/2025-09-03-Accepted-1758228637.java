/*
 * Submission: 1758228637
 * Problem: Queries on a Permutation With Key (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 13:17:14 UTC
 * Runtime: 6 ms
 * Memory: 42.6 MB
 */

class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> p = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            p.add(i + 1);
        }
        for(int i = 0; i < queries.length; i++) {
            int cur = queries[i], idx = -1;
            for (int j = 0; j < m; j++) {
                if (p.get(j) == cur) {
                    idx = j;
                    break;
                }
            }
            queries[i] = idx;
            p.remove(idx);
            p.add(0,cur);
        } return queries;
    }
}