/*
 * Submission: 1719380949
 * Problem: Find Common Elements Between Two Arrays (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-01 10:20:17 UTC
 * Runtime: 7 ms
 * Memory: 46.2 MB
 */

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>();
        int[] ans = new int[2];
        for (int num : nums1) {
            a.add(num);
        }

        Set<Integer> b = new HashSet<>();
        for (int num : nums2) {
            b.add(num);
        }

        for (int num : nums1) {
            if (b.contains(num)) ans[0]++;
        }
        for (int num : nums2) {
            if (a.contains(num)) ans[1]++;
        }
        return ans;

    }
}