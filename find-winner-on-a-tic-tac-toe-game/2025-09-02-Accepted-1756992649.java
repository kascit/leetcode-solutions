/*
 * Submission: 1756992649
 * Problem: Find Winner on a Tic Tac Toe Game (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-02 12:10:58 UTC
 * Runtime: 0 ms
 * Memory: 41 MB
 */

class Solution {
    public String tictactoe(int[][] moves) {
        int a = 0, b = 0;
        int[] wins = new int[]{0b111000000, 0b000111000, 0b000000111, // rows
                               0b100100100, 0b010010010, 0b001001001, // columns
                               0b100010001, 0b001010100};              // diagonals
        
        for (int i = 0; i < moves.length; i++) {
            int bit = 1 << (moves[i][0]*3 + moves[i][1]);
            
            if ((i & 1) == 0) {
                a |= bit; // Player A moves
                for (int w : wins) if ((a & w) == w) return "A";
            } else {
                b |= bit; // Player B moves
                for (int w : wins) if ((b & w) == w) return "B";
            }
        }
        
        return (moves.length < 9) ? "Pending" : "Draw";
    }
}
