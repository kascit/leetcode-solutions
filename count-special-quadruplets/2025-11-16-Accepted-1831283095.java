/*
 * Submission: 1831283095
 * Problem: Count Special Quadruplets (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 11:48:19 UTC
 * Runtime: 9 ms
 * Memory: 45 MB
 */

class Solution {
    public int countQuadruplets(int[] nums) {
        int n = nums.length, res = 0;
        Map<Integer, Integer> cnt = new HashMap<>();

        for (int c = 0; c < n; c++) {
            for (int d = c + 1; d < n; d++) {
                if (cnt.containsKey(nums[d] - nums[c])) {
                    res += cnt.get(nums[d] - nums[c]);
                }
            }

            for (int a = 0; a < c; a++) {
                cnt.merge(nums[a] + nums[c], 1, Integer::sum);
            }
        }

        return res;
    }
}