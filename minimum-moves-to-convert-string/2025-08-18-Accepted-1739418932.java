/*
 * Submission: 1739418932
 * Problem: Minimum Moves to Convert String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 09:05:37 UTC
 * Runtime: 1 ms
 * Memory: 41.3 MB
 */

class Solution {
    static{
        for(int i=0;i<300;i++){
            minimumMoves("X");
        }
    }
    public static int minimumMoves(String s) {
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