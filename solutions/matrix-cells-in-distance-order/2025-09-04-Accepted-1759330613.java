/*
 * Submission: 1759330613
 * Problem: Matrix Cells in Distance Order (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 12:18:32 UTC
 * Runtime: 15 ms
 * Memory: 46.5 MB
 */

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows * cols][2];
        int idx = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                ans[idx++] = new int[]{r, c};
            }
        }

        Arrays.sort(ans, (a, b) -> {
            int da = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int db = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return da - db;
        });

        return ans;
    }
}
