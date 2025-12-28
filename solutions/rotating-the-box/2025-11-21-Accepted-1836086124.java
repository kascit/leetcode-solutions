/*
 * Submission: 1836086124
 * Problem: Rotating the Box (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 15:23:25 UTC
 * Runtime: 8 ms
 * Memory: 125 MB
 */

class Solution {
    public char[][] rotateTheBox(char[][] b) {
        int r = b.length;
        int c = b[0].length;

        char[][] ans = new char[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][r - i - 1] = b[i][j];
            }
        }

        
        for (int col = 0; col < r; col++) {
            int write = c - 1;                 
            for (int row = c - 1; row >= 0; row--) {
                if (ans[row][col] == '*') {
                    write = row - 1;
                } else if (ans[row][col] == '#') {
                    ans[row][col] = '.';
                    ans[write][col] = '#';
                    write--;
                } 
            }
        }

        return ans;
    }
}
