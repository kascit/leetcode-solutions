/*
 * Submission: 1706096725
 * Problem: Count Pairs Whose Sum is Less than Target (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 15:14:04 UTC
 * Runtime: 2 ms
 * Memory: 42.6 MB
 */

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int  cnt = 0;


        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if (nums.get(i) + nums.get(j) < target) cnt++;
            }
        }
        return cnt;
    }
}