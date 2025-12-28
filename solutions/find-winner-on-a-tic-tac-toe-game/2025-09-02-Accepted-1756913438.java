/*
 * Submission: 1756913438
 * Problem: Find Winner on a Tic Tac Toe Game (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-02 10:35:22 UTC
 * Runtime: 0 ms
 * Memory: 41.2 MB
 */

class Solution {
    public String tictactoe(int[][] moves) {
        // boolean ar = true, ac = true, ad = true, ab = true, br = true, bc = true, bd = true, ba = true;
        int a = 0, b = 0;
        for(int i = 0; i < moves.length; i++) {
            if ((i&1)==0) {
                a |= 1<<(moves[i][1]+moves[i][0]*3);
            } else {
                b |= 1<<(moves[i][1]+moves[i][0]*3);
            }
        }
        // System.out.println(a);
        // System.out.println(b);

        int[] check = new int[]{292, 146, 73, 448, 56, 7, 273, 84};

        for (int c : check) {
            if ((c&a) == c) return "A";
            if ((c&b) == c) return "B";
        } return (moves.length < 9) ? "Pending" : "Draw";
    }
}

// 111100