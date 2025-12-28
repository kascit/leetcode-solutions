/*
 * Submission: 1771334434
 * Problem: Game of Life (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-15 07:57:22 UTC
 * Runtime: 0 ms
 * Memory: 42 MB
 */

class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length, cols = board[0].length;
        int[] dirRow ={-1, -1, -1, 0, +1, +1, +1, 0};
        int[] dirCol ={-1, 0, +1, +1, +1, 0, -1, -1};
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolean isAlive = (board[i][j] == 1);
                int count = 0;
                for (int k = 0; k < 8; k++) {
                    int x = i + dirRow[k];
                    int y = j + dirCol[k];
                    if (x < 0 || x == rows || y < 0 || y == cols) continue;
                    if (board[x][y]%2 == 1) count++;
                }
                // System.out.println(i + " " + j + " count: " + count);
                if (isAlive) {
                    if (count == 2 || count == 3) {
                        board[i][j] += 2;
                    }
                } else {
                    if (count == 3) {
                        board[i][j] += 2;
                    }
                }
            }
        }
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(board[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 3 || board[i][j] == 2) {
                    board[i][j] = 1;
                } else board[i][j] = 0;
            }
        }

    }
}