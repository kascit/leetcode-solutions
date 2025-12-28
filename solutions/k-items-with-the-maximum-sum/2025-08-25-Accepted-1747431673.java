/*
 * Submission: 1747431673
 * Problem: K Items With the Maximum Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 06:59:02 UTC
 * Runtime: 1 ms
 * Memory: 42 MB
 */

class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (numOnes >= k) return k;
        int ans = 0;
        ans += numOnes;
        k -= numOnes;
        if (numZeros >= k) return ans;
        k -= numZeros;
        return ans - k;
    }
}