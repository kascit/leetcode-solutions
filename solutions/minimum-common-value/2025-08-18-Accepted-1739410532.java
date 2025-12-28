/*
 * Submission: 1739410532
 * Problem: Minimum Common Value (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 08:55:12 UTC
 * Runtime: 0 ms
 * Memory: 62.7 MB
 */

class Solution {
    static{
        for(int i=0;i<300;i++){
            getCommon(new int[]{1}, new int[]{1});
        }
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        int l = 0, r = 0, len = nums1.length, len2 = nums2.length;
        while( l < len && r < len2){
            if (nums1[l] == nums2[r]) return nums2[r];
            else if (nums1[l] < nums2[r]){
                l++;
            } else r++;
        }
        return -1;
    }
}