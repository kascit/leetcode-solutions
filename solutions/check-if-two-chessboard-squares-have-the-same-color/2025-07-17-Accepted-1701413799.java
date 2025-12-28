/*
 * Submission: 1701413799
 * Problem: Check if Two Chessboard Squares Have the Same Color (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-17 15:04:11 UTC
 * Runtime: 0 ms
 * Memory: 41.8 MB
 */

class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        return h(c1) == h(c2);
    }
    private int h(String s){
        return (s.charAt(0)-'a')&1 ^ (s.charAt(1)-'0')&1;
    }

}