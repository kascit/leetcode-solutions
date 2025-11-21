/*
 * Submission: 1690328339
 * Problem: Determine Color of a Chessboard Square (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-08 05:02:37 UTC
 * Runtime: 0 ms
 * Memory: 41.7 MB
 */

class Solution {
    public boolean squareIsWhite(String coordinates) {
        int i = (int) (coordinates.charAt(0) - 'a' + 1);
        int j = (int) (coordinates.charAt(1) - '1' + 1);
        return (i&1 ^ j&1) == 1;
    }
}