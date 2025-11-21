/*
 * Submission: 1738347931
 * Problem: Construct the Minimum Bitwise Array I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 09:39:21 UTC
 * Runtime: 3 ms
 * Memory: 45 MB
 */

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int len = nums.size();
        int[] ans = new int[len];
        int idx = 0;
        for (int n : nums){
            int start = 1;
            ans[idx] = -1;
            for(int i = start; i < n; i++){
                if ( (i|(i+1)) == n) {
                    ans[idx] = i;
                    break;
                }
            }
            idx++;
        }
        return ans;
    }
}