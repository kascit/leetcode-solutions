/*
 * Submission: 1746539872
 * Problem: Design Neighbor Sum Service (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 11:29:54 UTC
 * Runtime: 18 ms
 * Memory: 45.8 MB
 */

class NeighborSum {
    int[][] grid;
    int m, n;
    Map<Integer, int[]> posMap;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        this.posMap = new HashMap<>(m * n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                posMap.put(grid[i][j], new int[]{i, j});
            }
        }
    }

    public int adjacentSum(int value) {
        int[] pos = posMap.get(value);
        int i = pos[0], j = pos[1];
        int sum = 0;
        if (i > 0) sum += grid[i - 1][j];
        if (i + 1 < m) sum += grid[i + 1][j];
        if (j > 0) sum += grid[i][j - 1];
        if (j + 1 < n) sum += grid[i][j + 1];
        return sum;
    }

    public int diagonalSum(int value) {
        int[] pos = posMap.get(value);
        int i = pos[0], j = pos[1];
        int sum = 0;
        if (i > 0 && j > 0) sum += grid[i - 1][j - 1];
        if (i + 1 < m && j + 1 < n) sum += grid[i + 1][j + 1];
        if (i + 1 < m && j > 0) sum += grid[i + 1][j - 1];
        if (i > 0 && j + 1 < n) sum += grid[i - 1][j + 1];
        return sum;
    }
}
