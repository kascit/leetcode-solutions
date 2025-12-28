/*
 * Submission: 1715670916
 * Problem: Smallest Subarrays With Maximum Bitwise OR (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-29 10:38:25 UTC
 * Runtime: 21 ms
 * Memory: 61.1 MB
 */

class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int maxOR = 0, len = nums.length;
        int[] ans = new int[len];
        int[] bits = new int[30];
        for (int i = len - 1; i >= 0; i--){
            int curOR = nums[i], farthest = i, j = 0;
            maxOR |= curOR;
            int need = maxOR ^ curOR;
           
           while (curOR > 0){
                if ((curOR & 1) == 1) bits[j] = i;
                curOR >>= 1;
                j++;
           }
           //System.out.print(Arrays.toString(bits) + need);
            j = 0;
           while (need > 0){
            if ((need & 1) == 1) {
               farthest = (farthest > bits[j]) ? farthest : bits[j];
            }
            j++;
            need >>= 1;
           }
           //System.out.println(" " + farthest);
            ans[i] = farthest - i + 1;
        }
        return ans;
    }
}