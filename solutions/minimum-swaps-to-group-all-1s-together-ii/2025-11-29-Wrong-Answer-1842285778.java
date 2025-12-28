/*
Submission: 1842285778
Status: Wrong Answer
Timestamp: 2025-11-29 07:20:59 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int minSwaps(int[] nums) {
        int k = 0;
        for (int n : nums) k += n;
        int l = 0, r = 0;
        int len = nums.length;
        int cur = 0, ans = Integer.MAX_VALUE;
        int in = 0;
        boolean br = false;
        int curl = 0;
        while (r<len) {
            if (in == 2*k) break;
            if (br) in++;
            if (curl > k) {
                cur -= nums[l];
                l++;
                curl--;
                if (l == len) {
                    l = 0;
                }
                continue;
            }
            if (curl == k) {
                // System.out.println(l+"   "+r);
                // System.out.println(cur);
                ans = Math.min(ans,k-cur);
            }
            // System.out.println(r+" "+nums[r]);
            cur += nums[r];
            r++;
            curl++;
            if (r == len) {
                r = 0;
                br = true;
            }
        } return ans;
    }
}