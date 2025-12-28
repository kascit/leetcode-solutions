/*
 * Submission: 1746367494
 * Problem: Find All K-Distant Indices in an Array (Easy)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-08-24 08:15:48 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int len = nums.length, idx = 0;
        List<Integer> ans = new ArrayList<>(len);

        for (int i = 0; i < len; i++){
            if (nums[i] == key) {
                for(int j = -k; j < k + 1; j++) {
                    if (i+j >= len) break;
                    if (i+j >= 0) {
                        if(!ans.contains(i+j))ans.add(i+j);
                    }
                }
            }
        } return ans;
    }
}