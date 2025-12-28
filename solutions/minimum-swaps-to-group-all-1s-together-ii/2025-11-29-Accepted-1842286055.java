/*
Submission: 1842286055
Status: Accepted
Timestamp: 2025-11-29 07:21:28 UTC
Runtime: 5 ms
Memory: 90.3 MB
*/

class Solution {
    public int minSwaps(int[] nums) {
        int k = 0;
        for (int n : nums) k += n;
        int l = 0, r = 0;
        int len = nums.length;
        int cur = 0, ans = Integer.MAX_VALUE;
        int br = 0;
        int curl = 0;
        while (r<len) {
            if (br == 2) break;
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
                br++;
            }
        } return ans;
    }
}