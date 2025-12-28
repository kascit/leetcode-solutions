/*
 * Submission: 1780220540
 * Problem: Sudoku Solver (Hard)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-23 13:53:01 UTC
 * Runtime: 35 ms
 * Memory: 41.3 MB
 */

class Solution {
    private int[] rows = new int[9];
    private int[] cols = new int[9];
    private int[] boxes = new int[9];
    private char[][] b;
    private java.util.List<Integer> empties = new java.util.ArrayList<>();

    public void solveSudoku(char[][] board) {
        this.b = board;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = b[i][j];
                if (c == '.') {
                    empties.add(i * 9 + j);
                } else {
                    int val = c - '1';
                    int bit = 1 << val;
                    int box = (i / 3) * 3 + j / 3;
                    rows[i] |= bit;
                    cols[j] |= bit;
                    boxes[box] |= bit;
                }
            }
        }
        backtrack(0);
    }

    private boolean backtrack(int idx) {
        if (idx == empties.size()) return true;

        int pos = empties.get(idx);
        int i = pos / 9, j = pos % 9, box = (i / 3) * 3 + j / 3;

        int mask = rows[i] | cols[j] | boxes[box];
        int available = ~mask & 0x1FF;

        while (available > 0) {
            int bit = available & -available;
            available -= bit;
            int val = Integer.numberOfTrailingZeros(bit);

            rows[i] |= bit;
            cols[j] |= bit;
            boxes[box] |= bit;
            b[i][j] = (char) ('1' + val);

            if (backtrack(idx + 1)) return true;

            rows[i] ^= bit;
            cols[j] ^= bit;
            boxes[box] ^= bit;
            b[i][j] = '.';
        }
        return false;
    }
}
