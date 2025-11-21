/*
 * Submission: 1832068061
 * Problem: Account Balance After Rounded Purchase (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 07:24:54 UTC
 * Runtime: 0 ms
 * Memory: 41.8 MB
 */

class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int cur = 100 - purchaseAmount; return (cur%10 <= 5) ? cur - cur%10 : cur + 10 - cur%10;
    }
}