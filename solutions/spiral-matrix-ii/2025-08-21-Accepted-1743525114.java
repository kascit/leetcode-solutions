/*
 * Submission: 1743525114
 * Problem: Spiral Matrix II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 17:47:29 UTC
 * Runtime: 0 ms
 * Memory: 41.4 MB
 */

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top = 0, left = 0, right = n - 1, bottom = n - 1;
        int val = 1;
        while(top<=bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                ans[top][j] = val++;
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                ans[i][right] = val++;
            }
            right--;

            if (top<=bottom) {
                for (int j = right; j >= left; j--) {
                    ans[bottom][j] = val++;
                }
                bottom--;
            }
            if (left<=right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = val++;
                }
                left++;
            }
        } return ans;
    }
}