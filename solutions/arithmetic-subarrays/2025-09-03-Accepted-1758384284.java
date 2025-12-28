/*
 * Submission: 1758384284
 * Problem: Arithmetic Subarrays (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 15:52:14 UTC
 * Runtime: 17 ms
 * Memory: 45.3 MB
 */

class Solution {
    int[] nums;
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        int len = nums.length, cur = 0;
        this.nums = nums;
        int[] pref = new int[len+1];
        for (int i = 0; i < len; i++) {
            pref[i + 1] = pref[i] + nums[i];
        }
        for(int i = 0; i < l.length; i++) {
            ans.add(isAr(l[i],r[i]));
        } return ans;
    }

    private boolean isAr(int l, int r) {
        int[] temp = new int[r-l+1];
        int idx = 0;
        for(int i = l; i <= r; i++) {
            temp[idx++] = nums[i];
        }
        Arrays.sort(temp);
        int diff = temp[1] - temp[0];
        for (int i = 2; i <= r-l; i++) {
            if (temp[i] - temp[i-1] != diff) return false;
        } return true;

    }
}