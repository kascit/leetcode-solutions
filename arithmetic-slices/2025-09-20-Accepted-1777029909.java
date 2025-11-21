/*
 * Submission: 1777029909
 * Problem: Arithmetic Slices (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-20 13:23:05 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
 */

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans = 0, len = nums.length;
        if (len < 3) return 0;
        int l = 0, r = 1;
        while (r < len) {
            int diff = nums[r] - nums[l];
            r++;
            while (r < len && diff == nums[r] - nums[r-1]) {
                r++;
            }
            if (l + 3 <= r) {
                // System.out.println(l+"   "+r);
                ans += (r - l - 2)*(r - l - 1)/2;
            }
            l = r - 1;
        } return ans;
    }
}
/*
1 2 3 4 5 6
1 2 3
  2 3 4
    3 4 5
      4 5 6
1 2 3 4
  2 3 4 5
    3 4 5 6
1 2 3 4 5 
  2 3 4 5 6
1 2 3 4 5 6*/