/*
 * Submission: 1730305510
 * Problem: Find the Integer Added to Array I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 16:11:48 UTC
 * Runtime: 0 ms
 * Memory: 43.5 MB
 */

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int ans = 0;
        for(int i = 0; i < nums1.length; i++){
            ans += nums2[i]-nums1[i];
        } return ans/nums1.length;
    }
}