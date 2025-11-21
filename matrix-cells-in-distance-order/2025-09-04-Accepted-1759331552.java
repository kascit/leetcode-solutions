/*
 * Submission: 1759331552
 * Problem: Matrix Cells in Distance Order (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 12:19:46 UTC
 * Runtime: 8 ms
 * Memory: 46.4 MB
 */

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int total = rows * cols;
        int[][] ans = new int[total][2];

        int maxDist = (rows - 1) + (cols - 1); 
        List<int[]>[] buckets = new ArrayList[maxDist + 1];
        for (int i = 0; i <= maxDist; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int dist = Math.abs(r - rCenter) + Math.abs(c - cCenter);
                buckets[dist].add(new int[]{r, c});
            }
        }

        int idx = 0;
        for (int d = 0; d <= maxDist; d++) {
            for (int[] cell : buckets[d]) {
                ans[idx++] = cell;
            }
        }

        return ans;
    }
}
