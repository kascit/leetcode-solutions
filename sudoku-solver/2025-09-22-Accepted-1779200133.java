/*
 * Submission: 1779200133
 * Problem: Sudoku Solver (Hard)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-22 15:01:49 UTC
 * Runtime: 43 ms
 * Memory: 41.4 MB
 */

class Solution {
    int[] flags;
    char[][] b;
    public void solveSudoku(char[][] board) {
        this.flags = new int[9]; 
        this.b = board;
        dos(0,0);
        dost(0,0);
        return;
    }

    private boolean dos(int i, int j) {
        if (i == 9) return true;
        if (j == 9) return dos(i+1,0);
        if (b[i][j] == '.') return dos(i,j+1);
        int val = b[i][j] - '1';
        int row = 1 << val;
        int col = 1 << (val+9);
        int sq = 1 << (val + 18);

        int squa = (i/3)*3 + j/3;
        
        if ((flags[i] & row) > 0 || (flags[j] & col) > 0 || (flags[squa] & sq) > 0) return false;
        flags[i] |= row;
        flags[j] |= col;
        flags[squa] |= sq;
        return dos(i,j+1);

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