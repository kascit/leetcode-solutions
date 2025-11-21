/*
 * Submission: 1604980063
 * Problem: Single Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 21:05:28 UTC
 * Runtime: 1 ms
 * Memory: 46.1 MB
 */

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num : nums){
            ans ^= num;
        }
        return ans;
    }
}