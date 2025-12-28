/*
 * Submission: 1711154234
 * Problem: XOR Operation in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 15:28:26 UTC
 * Runtime: 0 ms
 * Memory: 40.4 MB
 */

class Solution {
    public int xorOperation(int n, int start) {
        int ans = start;
        while (--n > 0){
            ans = ans ^ (start += 2);
        }
        return ans;
    }
}