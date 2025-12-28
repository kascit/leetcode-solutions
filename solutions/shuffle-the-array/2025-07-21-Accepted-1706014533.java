/*
 * Submission: 1706014533
 * Problem: Shuffle the Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 14:03:41 UTC
 * Runtime: 1 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        int it = 0, jt = n;
        for (int i = 0; i < len; i++){
            if ((i&1) == 0) {
                ans[i] = nums[it++];
            } else {
                //System.out.println("hehr");
                ans[i] = nums[jt++];
            }
        }
        return ans;
    }
}