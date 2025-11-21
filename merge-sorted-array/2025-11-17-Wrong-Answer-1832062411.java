/*
 * Submission: 1832062411
 * Problem: Merge Sorted Array (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-17 07:17:23 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = nums1.length;
        m--;n--;end--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] >= nums2[n]) {
                nums1[end] = nums1[m];
                m--;
            } else {
                nums1[end] = nums2[n];
                n--;
            }
            end--;
        }
        while (m >= 0) {
            nums1[end] = nums1[m];
            m--;
        }
        while (n >= 0) {
            nums1[end] = nums2[n];
            n--;
        }
    }
}