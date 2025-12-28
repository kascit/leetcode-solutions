/*
 * Submission: 1832068838
 * Problem: Account Balance After Rounded Purchase (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 07:25:53 UTC
 * Runtime: 0 ms
 * Memory: 42.2 MB
 */

class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rounded = ((purchaseAmount + 5) / 10) * 10;
        return 100 - rounded;
    }
}