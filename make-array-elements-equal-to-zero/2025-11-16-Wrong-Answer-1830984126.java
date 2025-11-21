/*
 * Submission: 1830984126
 * Problem: Make Array Elements Equal to Zero (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-16 04:38:35 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int[] suf = new int[n+1];
        for (int i = n - 1; i >= 0; i--) {
            suf[i] = nums[i] + suf[i+1];
        }
        System.out.println(Arrays.toString(suf));
        int pre = 0, ans = 0, cnt = 0;
        for (int i = 0; i < n;) {
            int cur = nums[i];
            if (cur == 0 && pre == suf[i]) {
                // System.out.println();
                do {cnt++;}
                while(nums[++i] == 0);
            } else i++;
            ans += cnt*2;
            cnt = 0;
            pre+= cur;
        }
        return ans;
    }
}