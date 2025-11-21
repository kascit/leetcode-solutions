/*
 * Submission: 1743958396
 * Problem: Spiral Matrix III (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-22 05:27:13 UTC
 * Runtime: 4 ms
 * Memory: 45.2 MB
 */

class Solution {
    int r, c;
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int elems = rows*cols;
        r = rows; c = cols;
        int[][] ans = new int[elems][2];
        int dist = 1, idx = 0;
        while (idx < elems) {
            //go left 1
            //go down 1
            for (int j = 0; j < dist; j++) {
                if (isValid(rStart,cStart)) {
                    ans[idx][0] = rStart;
                    ans[idx][1] = cStart;
                    idx++;

                }
                cStart++;
            }
            for (int j = 0; j < dist; j++) {
                if (isValid(rStart,cStart)) {
                    ans[idx][0] = rStart;
                    ans[idx][1] = cStart;
                    idx++;
                }
                rStart++;
            }
            dist++;

            //go right 2
            for (int j = 0; j < dist; j++) {
                if (isValid(rStart,cStart)) {
                    ans[idx][0] = rStart;
                    ans[idx][1] = cStart;
                    idx++;
                }
                cStart--;
            }
            //go up 2
            for (int j = 0; j < dist; j++) {
                if (isValid(rStart,cStart)) {
                    ans[idx][0] = rStart;
                    ans[idx][1] = cStart;
                    idx++;
                }
                rStart--;
            }
            dist++;
        }
        return ans;
    }

    private boolean isValid(int row, int col) {
        return row >= 0 && row < r && col >= 0 && col < c;
    }
}