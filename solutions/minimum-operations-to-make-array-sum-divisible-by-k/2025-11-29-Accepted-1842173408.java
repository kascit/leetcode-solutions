/*
Submission: 1842173408
Status: Accepted
Timestamp: 2025-11-29 04:03:45 UTC
Runtime: 5 ms
Memory: 47.3 MB
*/

class Solution {
    public int minOperations(int[] nums, int k) {
        return (Arrays.stream(nums).sum() % k);
    }
}