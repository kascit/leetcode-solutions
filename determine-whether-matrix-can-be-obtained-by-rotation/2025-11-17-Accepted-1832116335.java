/*
 * Submission: 1832116335
 * Problem: Determine Whether Matrix Can Be Obtained By Rotation (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 08:35:09 UTC
 * Runtime: 0 ms
 * Memory: 43.3 MB
 */

class Solution {
    int[][] m, t;
    public boolean findRotation(int[][] mat, int[][] target) {
        this.m = mat;
        this.t = target;
        if (equal()) return true;
        for (int i = 0; i < 3; i++) {
            rotate();
            // for (int[] row : m) {
            //     for (int x : row) {
            //         System.out.print(x + " ");
            //     }
            //     System.out.println();
            // }
            // System.out.println("==============");
            if (equal()) return true;
        } return false;
    }

    void rotate() {
        int n = m.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = tmp;
            }
        }

        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int tmp = m[i][l];
                m[i][l] = m[i][r];
                m[i][r] = tmp;
                l++; r--;
            }
        }
    }

    boolean equal() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] != t[i][j]) return false;
            }
        } return true;
    }
}