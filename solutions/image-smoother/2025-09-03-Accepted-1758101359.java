/*
 * Submission: 1758101359
 * Problem: Image Smoother (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 10:42:00 UTC
 * Runtime: 4 ms
 * Memory: 45.7 MB
 */

class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++){
                ans[i][j] = avgAround(img, i, j, m, n);
            }
        return ans;
    }
    public static int avgAround(int[][] img, int i, int j, int m, int n) {
        int sum = 0;
        int count = 0;

        for (int r = i - 1; r <= i + 1; r++) {
            for (int c = j - 1; c <= j + 1; c++) {
                if (r >= 0 && r < m && c >= 0 && c < n) {
                    sum += img[r][c];
                    count++;
                }
            }
        }

        return sum / count;
    }

}