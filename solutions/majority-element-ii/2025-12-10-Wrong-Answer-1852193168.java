/*
Submission: 1852193168
Status: Wrong Answer
Timestamp: 2025-12-10 16:39:50 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = Integer.MIN_VALUE, cnt1 = 0,
         c2 = Integer.MIN_VALUE, cnt2 = 0;
        for (int n : nums) {
          if (cnt1 == 0 || n == c1) {
            c1 = n;
            cnt1++;
          } else if (cnt2 == 0 || n == c2) {
            c2 = n;
            cnt2++;
          } else {
            cnt1--;
            cnt2--;
          }
        }
        cnt1 = 0; cnt2 = 0;
        for (int v : nums) {
            if (v == c1) cnt1++;
            else if (v == c2) cnt2++;
        }

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        if (cnt1 > n/3) ans.add(c1);
        if (cnt2 > n/3) ans.add(c2);
        return ans;

    }
}