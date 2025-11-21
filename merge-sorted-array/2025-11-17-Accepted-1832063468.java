/*
 * Submission: 1832063468
 * Problem: Merge Sorted Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 07:18:49 UTC
 * Runtime: 0 ms
 * Memory: 43.9 MB
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
        while (n >= 0) {
            nums1[end] = nums2[n];
            n--;
            end--;
        }
    }
}