/*
 * Submission: 1725817990
 * Problem: Find Missing and Repeated Values (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-06 15:28:06 UTC
 * Runtime: 1 ms
 * Memory: 45.6 MB
 */

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length * grid[0].length;
        long sumExpected = (long) n * (n + 1) / 2;
        long sqSumExpected = (long) n * (n + 1) * (2 * n + 1) / 6;

        long sumActual = 0;
        long sqSumActual = 0;

        for (int[] row : grid) {
            for (int num : row) {
                sumActual += num;
                sqSumActual += (long) num * num;
            }
        }

        long delta = sumActual - sumExpected;
        long deltaSq = sqSumActual - sqSumExpected;

        long sumYX = deltaSq / delta;

        int y = (int) ((delta + sumYX) / 2);
        int x = (int) (y - delta);

        return new int[] { y, x };
    }
}