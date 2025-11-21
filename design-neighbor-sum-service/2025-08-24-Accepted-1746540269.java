/*
 * Submission: 1746540269
 * Problem: Design Neighbor Sum Service (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 11:30:20 UTC
 * Runtime: 16 ms
 * Memory: 45.5 MB
 */

class NeighborSum {
    int[][] grid;
    int m, n;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
    }

    private int[] find(int value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) return new int[]{i, j};
            }
        }
        return null;
    }

    public int adjacentSum(int value) {
        int[] pos = find(value);
        int i = pos[0], j = pos[1];
        int sum = 0;
        if (i > 0) sum += grid[i - 1][j];
        if (i + 1 < m) sum += grid[i + 1][j];
        if (j > 0) sum += grid[i][j - 1];
        if (j + 1 < n) sum += grid[i][j + 1];
        return sum;
    }

    public int diagonalSum(int value) {
        int[] pos = find(value);
        int i = pos[0], j = pos[1];
        int sum = 0;
        if (i > 0 && j > 0) sum += grid[i - 1][j - 1];
        if (i + 1 < m && j + 1 < n) sum += grid[i + 1][j + 1];
        if (i + 1 < m && j > 0) sum += grid[i + 1][j - 1];
        if (i > 0 && j + 1 < n) sum += grid[i - 1][j + 1];
        return sum;
    }
}
