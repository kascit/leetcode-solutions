/*
 * Submission: 1779181640
 * Problem: Sudoku Solver (Hard)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-22 14:42:58 UTC
 * Runtime: 44 ms
 * Memory: 41.2 MB
 */

class Solution {
    int[] flags;
    char[][] b;
    public void solveSudoku(char[][] board) {
        this.flags = new int[9]; 
        this.b = board;
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;

                int val = board[r][c] - '1'; 
                int square = (r / 3) * 3 + (c / 3);

                int maskRow    = 1 << val;         
                int maskCol    = 1 << (val + 9);   
                int maskSquare = 1 << (val + 18);  

                flags[r] |= maskRow;
                flags[c] |= maskCol;
                flags[square] |= maskSquare;
            }
        }
        dost(0,0);
        return;
    }

    private boolean dost(int i, int j) {
        if (i == 9) return true;
        if (j == 9) return dost(i+1,0); 
        if (b[i][j] != '.') return dost(i,j+1);
        int squa = (i/3)*3 + j/3;
        for (int it = 0; it < 9; it++) {
            int r = 1 << it;
            int c = 1 << (it+9);
            int s = 1 << (it+18);
            if ((flags[i] & r) == 0 && (flags[j] & c) == 0 && (flags[squa] & s) == 0) {
                flags[i] |= r;
                flags[j] |= c;
                flags[squa] |= s;
                b[i][j] = (char)('1' + it);
                if (dost(i,j+1)) return true;
                flags[i] ^= r;
                flags[j] ^= c;
                flags[squa] ^= s;
                b[i][j] = '.';
            }
        }
        return false;
    }
}