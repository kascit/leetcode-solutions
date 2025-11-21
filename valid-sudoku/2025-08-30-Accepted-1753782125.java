/*
 * Submission: 1753782125
 * Problem: Valid Sudoku (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 16:21:23 UTC
 * Runtime: 1 ms
 * Memory: 44.6 MB
 */

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] flags = new int[9]; // 9 elements to track all rows, cols, and boxes

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;

                int val = board[r][c] - '1'; 
                int square = (r / 3) * 3 + (c / 3);

                int maskRow    = 1 << val;          // bits 0–8
                int maskCol    = 1 << (val + 9);    // bits 9–17
                int maskSquare = 1 << (val + 18);   // bits 18–26

                if ((flags[r] & maskRow) > 0 ||
                    (flags[c] & maskCol) > 0 ||
                    (flags[square] & maskSquare) > 0) {
                    return false;
                }

                flags[r] |= maskRow;
                flags[c] |= maskCol;
                flags[square] |= maskSquare;
            }
        }

        return true;
    }
}
