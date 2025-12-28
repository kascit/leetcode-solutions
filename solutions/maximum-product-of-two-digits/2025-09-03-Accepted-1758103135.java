/*
 * Submission: 1758103135
 * Problem: Maximum Product of Two Digits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 10:44:12 UTC
 * Runtime: 1 ms
 * Memory: 41.4 MB
 */

class Solution {
    public int maxProduct(int n) {
        int i = 0, j = 0;
        while(n>0){
            int cur = n%10;
            if (cur > i) {
                j = i;
                i = cur;
            } else if (cur > j) {
                j = cur;
            }
            n/=10;
        } return i * j;
    }
}