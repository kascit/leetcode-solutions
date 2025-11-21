/*
 * Submission: 1746760276
 * Problem: Longest Even Odd Subarray With Threshold (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 15:21:39 UTC
 * Runtime: 4 ms
 * Memory: 45.3 MB
 */

class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int l = 0, r = 0, len = nums.length, max = 0;
        boolean odd = false;
        while (l < len && r < len) {
            if (nums[l]%2 == 1 || nums[l] > threshold) {
                l++;
                continue;
            }
            odd = true;
            for (r = l + 1; r < len; r++) {
            // System.out.println(odd+"   "+r+"   "+nums[r]);
                if (nums[r] > threshold){
            // System.out.println("thresh");
                     break;

                }
                if (odd && nums[r]%2 == 0) { 
            // System.out.println("true");
                    break;
                }
                else if (!odd && nums[r]%2 == 1) {
            // System.out.println("false");
                    break;
                }
                odd = !odd;

            }
            max = Math.max(max,r-l+1);
            l++;
        } return Math.max(max-1,0);
    }
}