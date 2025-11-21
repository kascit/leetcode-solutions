/*
 * Submission: 1777026902
 * Problem: Arithmetic Slices (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-20 13:18:59 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans = 0, len = nums.length;
        if (len < 3) return 0;
        int l = 0, r = 1;
        int diff = nums[r] - nums[l];
        while (r < len) {
            while (r < len && diff == nums[r] - nums[r-1]) {
                r++;
            }
            if (l + 3 <= r) {
                // System.out.println(l+"   "+r);
                ans += (r - l - 2)*(r - l - 1)/2;
            }
            l = r++;
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