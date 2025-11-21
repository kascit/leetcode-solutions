/*
 * Submission: 1831270785
 * Problem: Make Array Elements Equal to Zero (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 11:30:00 UTC
 * Runtime: 1 ms
 * Memory: 43.7 MB
 */

class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int[] suf = new int[n+1];
        for (int i = n - 1; i >= 0; i--) {
            suf[i] = nums[i] + suf[i+1];
        }

        int pre = 0, ans = 0;
        int i = 0;

        while (i < n) {
            int cur = nums[i];

            if (cur == 0) {
                if (pre == suf[i+1]) {
                    while (i < n && nums[i] == 0) {
                        ans += 2;
                        i++;
                    }
                    continue;
                }
                if (Math.abs(pre - suf[i+1]) == 1) {
                    while (i < n && nums[i] == 0) {
                        ans += 1;
                        i++;
                    }
                    continue;
                }
            }

            pre += cur;
            i++;
        }
        return ans;
    }
}
