/*
Submission: 1836093895
Status: Accepted
Timestamp: 2025-11-21 15:35:48 UTC
Runtime: 0 ms
Memory: 43.8 MB
*/

class Solution {
    public void rotate(int[][] b) {
        int n = b.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = b[i][j];
                b[i][j] = b[j][i];
                b[j][i] = temp;
            }
        }
         for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int t = b[i][l];
                b[i][l] = b[i][r];
                b[i][r] = t;
                l++; r--;
            }
        }
    }
}