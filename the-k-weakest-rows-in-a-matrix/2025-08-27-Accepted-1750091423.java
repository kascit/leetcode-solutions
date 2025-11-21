/*
 * Submission: 1750091423
 * Problem: The K Weakest Rows in a Matrix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-27 11:36:45 UTC
 * Runtime: 3 ms
 * Memory: 45 MB
 */

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Integer[]> pq = new PriorityQueue<>(
            (a, b) -> {
                int cmp = Integer.compare(b[1], a[1]);
                if (cmp == 0) {
                    return Integer.compare(b[0], a[0]);
                }
                return cmp;
            });

        for (int i = 0; i < mat.length; i++) {
            int c = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) c++;
            }
            pq.add(new Integer[]{i, c});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] ans = new int[k];
        int idx = k - 1;
        while (!pq.isEmpty()) {
            ans[idx--] = pq.poll()[0];
        }
        return ans;
    }
}
