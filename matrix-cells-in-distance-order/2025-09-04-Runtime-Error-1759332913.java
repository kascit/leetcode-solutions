/*
 * Submission: 1759332913
 * Problem: Matrix Cells in Distance Order (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-09-04 12:21:31 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int total = rows * cols;
        int[][] ans = new int[total][2];
        int idx = 0;

        ans[idx++] = new int[]{rCenter, cCenter};

        int maxDist = Math.max(rCenter, rows - 1 - rCenter) + Math.max(cCenter, cols - 1 - cCenter);

        for (int d = 1; d <= maxDist; d++) {
            for (int k = 0; k <= d; k++) {
                int[][] positions = {
                    {rCenter + k, cCenter + (d - k)},
                    {rCenter + k, cCenter - (d - k)},
                    {rCenter - k, cCenter + (d - k)},
                    {rCenter - k, cCenter - (d - k)}
                };
                for (int[] pos : positions) {
                    int r = pos[0], c = pos[1];
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        if (idx == 0 || ans[idx-1][0] != r || ans[idx-1][1] != c) {
                            ans[idx++] = new int[]{r, c};
                        }
                    }
                }
            }
        }

        return ans;
    }
}
