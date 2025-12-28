/*
 * Submission: 1758111412
 * Problem: Buy Two Chocolates (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 10:54:47 UTC
 * Runtime: 1 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int buyChoco(int[] prices, int money) {
        int a = 101, b = 101;
        for (int p : prices) {
            if (p < a) {
                b = a;
                a = p;
            } else if (p < b) {
                b = p;
            }
        }
        return (money - a - b >= 0) ? money - a - b : money;
    }
}