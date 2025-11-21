/*
 * Submission: 1830552591
 * Problem: Bitwise OR of Even Numbers in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-15 17:22:25 UTC
 * Runtime: 0 ms
 * Memory: 44.4 MB
 */

class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans = 0;
        for(int n : nums) {
            if ((n&1) == 0) ans |= n;
        } return ans;
    }
}