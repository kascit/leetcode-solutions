/*
 * Submission: 1746507415
 * Problem: Find the Distinct Difference Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 10:54:46 UTC
 * Runtime: 6 ms
 * Memory: 45.6 MB
 */

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        Set<Integer> disc = new HashSet<>(len);
        for (int i = len - 1; i >= 0; i--) {
            ans[i]-=disc.size();
            disc.add(nums[i]);
        }
        // System.out.println(Arrays.toString(ans));
        // System.out.println(disc);
        disc.clear();
        // System.out.println(disc);
        for (int i = 0; i < len; i++) {
            disc.add(nums[i]);
            ans[i]+=disc.size();
        }
        // System.out.println(disc);
        return ans;
    }
}