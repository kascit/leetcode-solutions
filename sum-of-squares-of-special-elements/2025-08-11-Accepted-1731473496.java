/*
 * Submission: 1731473496
 * Problem: Sum of Squares of Special Elements  (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 16:38:48 UTC
 * Runtime: 1 ms
 * Memory: 44.2 MB
 */

class Solution {
    public int sumOfSquares(int[] nums) {
        int len = nums.length, ans = 0;
        int it = 1;
        for (int i : nums){
            if (len%it == 0) ans += Math.pow(i,2);
            it++;
        } return ans;
    }
}