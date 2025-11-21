/*
 * Submission: 1764969529
 * Problem: Arranging Coins (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-09 13:49:34 UTC
 * Runtime: 5 ms
 * Memory: 41.1 MB
 */

class Solution {
    public int arrangeCoins(int n) {
        int sub = 1;
        while (n > 0) {
            n-=sub;
            sub++;
        } return (n == 0) ? sub - 1 : sub - 2;
    }
}