/*
 * Submission: 1748533439
 * Problem: Maximum Count of Positive Integer and Negative Integer (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-26 04:46:44 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int maximumCount(int[] nums) {
        int firstZ = 0;
        int lastZ = -1;
        int len = nums.length;
        int l = 0, r = len - 1;

        while (l <= r) {
            int mid = l + (r-l)/2;
            // System.out.println(l+"   "+mid+"   "+r);
            if (nums[mid] >= 0) {
                firstZ = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        l = 0; r = len - 1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (nums[mid] < 1) {
                lastZ = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }


        return Math.max(firstZ,len-lastZ-1);
    }
}