/*
 * Submission: 1731464782
 * Problem: Time Needed to Buy Tickets (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 16:32:24 UTC
 * Runtime: 2 ms
 * Memory: 41.3 MB
 */

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans = 0, len = tickets.length, i = 0;
        while (tickets[k] > 0) {
            if (tickets[i] > 0) {
                tickets[i] -= 1;
                ans++;
            }
            i = (i + 1) % len;

        }
        return ans;
    }
}