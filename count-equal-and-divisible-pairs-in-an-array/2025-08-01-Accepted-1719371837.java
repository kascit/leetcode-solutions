/*
 * Submission: 1719371837
 * Problem: Count Equal and Divisible Pairs in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-01 10:10:32 UTC
 * Runtime: 2 ms
 * Memory: 42.5 MB
 */

class Solution {
    public int countPairs(int[] nums, int k) {
        int len = nums.length, ans = 0;
        for (int i = 0; i < len - 1; i++){
            int cur = nums[i];
            for (int j = i + 1; j < len; j++){
                if (cur == nums[j] && ((i*j)%k == 0)){
                    ans++;
                }
            }
        }return ans;
    }
}