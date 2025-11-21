/*
 * Submission: 1739414964
 * Problem: Minimum Moves to Convert String (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-18 09:00:44 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minimumMoves(String s) {
        int len = 0, moves = 0;
        boolean hasX = false;
        for(char ch : s.toCharArray()){
            if (len == 3){
                if (hasX) {
                    moves++;
                }
                len = 0;
                hasX = false;
            }
            if (ch == 'X'){
                hasX = true;
            }
            len++;
        } return moves + ((hasX) ? 1 : 0);
    }
}