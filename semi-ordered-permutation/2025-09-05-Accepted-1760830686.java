/*
 * Submission: 1760830686
 * Problem: Semi-Ordered Permutation (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 19:12:34 UTC
 * Runtime: 1 ms
 * Memory: 44.4 MB
 */

class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int len = nums.length;
        int f = -1, l = -1;
        for (int i = 0; i < len; i++) {
            if (f != -1 && l != -1) break;
            if (nums[i] == 1) f = i;
            else if (nums[i] == len) l = i;
        }

        if (f == 0 && l == len - 1) return 0;
        int ans = 0;
        if (f > l) ans--;
        ans += f;
        ans += len - l - 1;
        return ans;
    }
}