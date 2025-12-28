/*
Submission: 1852201328
Status: Accepted
Timestamp: 2025-12-10 16:48:05 UTC
Runtime: 2 ms
Memory: 52.8 MB
*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, cnt1 = 0,
         c2 = 0, cnt2 = 0;
        for (int n : nums) {
          if (n == c1) {
            // c1 = n;
            cnt1++;
          } else if (n == c2) {
            // c2 = n;
            cnt2++;
          } else if (cnt1 == 0) {
            c1 = n;
            cnt1 = 1;
          } else if (cnt2 == 0) {
            c2 = n;
            cnt2 = 1;
          }
            else {
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