/*
 * Submission: 1830989287
 * Problem: Make Array Elements Equal to Zero (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-16 04:46:02 UTC
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
        // System.out.println(Arrays.toString(suf));
        int pre = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            int cur = nums[i];
            // System.out.println(i);
            if (cur == 0) {
                if(pre == suf[i]) {
                    do {ans+=2;}
                    while(i+1 < n && nums[++i] == 0);
                }
                else if(Math.abs(pre-suf[i]) == 1) {
                    do {ans+=1;}
                    while(i+1 < n && nums[++i] == 0);
                } 
            } 
            // ans += cnt*2;
            // cnt = 0;
            pre+= cur;
        }
        return ans;
    }
}