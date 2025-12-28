/*
Submission: 1847332175
Status: Accepted
Timestamp: 2025-12-05 05:33:05 UTC
Runtime: 0 ms
Memory: 43.6 MB
*/

class Solution {
    public int countPartitions(int[] nums) {
        int len = nums.length, sum = 0;
        // int[] pref = new int[len];
        for (int i = 0; i < len; i++) {
            sum+=nums[i];
            // pref[i] = sum;
        }
        if ((sum&1) == 1) return 0;
        // sum = 0;
        return len - 1;        
    }
}