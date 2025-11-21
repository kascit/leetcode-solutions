/*
 * Submission: 1739417771
 * Problem: Minimum Moves to Convert String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 09:04:14 UTC
 * Runtime: 1 ms
 * Memory: 41.6 MB
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
            if (hasX) len++;
        } return moves + ((hasX) ? 1 : 0);
    }
}