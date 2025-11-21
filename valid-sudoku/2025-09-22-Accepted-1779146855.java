/*
 * Submission: 1779146855
 * Problem: Valid Sudoku (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-22 14:08:15 UTC
 * Runtime: 1 ms
 * Memory: 44.4 MB
 */

class Solution {
    int[] flag = new int[9];
    char[][] b;

    public boolean isValidSudoku(char[][] board) {
        this.b = board;
        return dos(0,0);
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
        if ((flag[i] & row) > 0 || (flag[j] & col) > 0 || (flag[squa] & sq) > 0) return false;
        flag[i] |= row;
        flag[j] |= col;
        flag[squa] |= sq;
        return dos(i,j+1);

    }
}