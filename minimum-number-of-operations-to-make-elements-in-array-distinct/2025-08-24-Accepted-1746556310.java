/*
 * Submission: 1746556310
 * Problem: Minimum Number of Operations to Make Elements in Array Distinct (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 11:48:07 UTC
 * Runtime: 0 ms
 * Memory: 44 MB
 */

class Solution {
    public int minimumOperations(int[] nums) {
        int len = nums.length, r = len - 1;
        int[] freq = new int[101];
        for (; r >= 0; r--) {
            if (freq[nums[r]] == 1) break;
            freq[nums[r]] = 1;
        }
        // System.out.println(r);
        return (r+3)/3;
    }
}