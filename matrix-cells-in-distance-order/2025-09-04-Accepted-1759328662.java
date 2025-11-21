/*
 * Submission: 1759328662
 * Problem: Matrix Cells in Distance Order (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 12:15:55 UTC
 * Runtime: 9 ms
 * Memory: 46 MB
 */

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows * cols][2];
        boolean[][] done = new boolean[rows][cols];
        int idx = 0;
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{rCenter, cCenter});
        done[rCenter][cCenter] = true;

        // BFS
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            ans[idx++] = cur;

            for (int[] d : dirs) {
                int nr = cur[0] + d[0];
                int nc = cur[1] + d[1];
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && !done[nr][nc]) {
                    done[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return ans;
    }
}
