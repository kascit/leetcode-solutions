/*
 * Submission: 1748535245
 * Problem: Maximum Count of Positive Integer and Negative Integer (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-26 04:48:29 UTC
 * Runtime: 0 ms
 * Memory: 45.1 MB
 */

class Solution {
    public int maximumCount(int[] nums) {
        int firstZ = -1;
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
        if (firstZ == -1) firstZ = len;

        return Math.max(firstZ,len-lastZ-1);
    }
}