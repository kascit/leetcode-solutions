/*
 * Submission: 1835949346
 * Problem: Minimum Distance to the Target Element (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 11:29:42 UTC
 * Runtime: 0 ms
 * Memory: 44.6 MB
 */

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = nums.length, last = -1;
        while((last = indexOf(nums,target,last)) != -1) {
            min = Math.min(Math.abs(last - start),min);
        } return min;
    }
    public static int indexOf(int[] arr, int target, int k) {
        for (int i = k + 1; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

}