/*
 * Submission: 1698264851
 * Problem: Number of Good Pairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-15 04:24:24 UTC
 * Runtime: 1 ms
 * Memory: 40.8 MB
 */

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]) cnt++;
            }
        }
        return cnt;
    }
}